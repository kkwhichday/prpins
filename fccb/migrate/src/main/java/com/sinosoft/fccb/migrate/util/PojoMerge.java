package com.sinosoft.fccb.migrate.util;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sinosoft.prpins.common.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Pojo数据对象处理，仅在service层使用。<pre>例子：<code>
 * 	PojoMerge pojoMerge = new PojoMerge(this);
 *	pojoMerge.mergeObject(prptmain, prptmain_po, false);
 * </code></pre>
 *
 * @author lxp
 *
 */
@SuppressWarnings("unchecked")
public class PojoMerge {

	private static Logger logger = LoggerFactory.getLogger(PojoMerge.class);

	private static final Map<Class, String> supportTypeMap = new HashMap<Class, String>();
	static {
		supportTypeMap.put(Integer.class, "");
		supportTypeMap.put(Long.class, "");
		supportTypeMap.put(Double.class, "");
		supportTypeMap.put(BigDecimal.class, "");
		supportTypeMap.put(String.class, "");
		supportTypeMap.put(Date.class, "");
		supportTypeMap.put(Boolean.class, "");
		supportTypeMap.put(byte[].class, "");
		supportTypeMap.put(java.util.List.class, "");
	}

	private BaseService service;

	/**
	 *
	 * @param service
	 */
	public PojoMerge(BaseService service){
		this.service = service;
	}

	private AnnotationMethod getAnnMethod(Class clazz,Object parent){
		Method idMethod = null;
		Method refMethod = null;
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods){
			String methodName = method.getName();
			if(!methodName.startsWith("get") && !methodName.startsWith("is") ){
				continue;
			}

			Annotation[] annotations = method.getAnnotations();
			if(annotations==null){
				continue;
			}

			for(Annotation annotation: annotations){
				if(annotation instanceof javax.persistence.Id ||
						annotation instanceof javax.persistence.EmbeddedId ){
					idMethod = method;
				}
				else if(annotation instanceof javax.persistence.JoinColumn ||
						annotation instanceof javax.persistence.JoinColumns ){
					if(parent.getClass().equals(method.getReturnType())  ){
						refMethod = method;
					}
				}
			}
			if(idMethod!=null && refMethod!=null){
				return new AnnotationMethod(idMethod, refMethod);
			}
		}
		return new AnnotationMethod(idMethod, refMethod);
	}

	private boolean needHandleMethod(Method method){
		Annotation[] annotations = method.getAnnotations();
		if(annotations==null){
			return true;
		}

		for(Annotation annotation: annotations){
			if(annotation instanceof javax.persistence.Id ||
					annotation instanceof javax.persistence.EmbeddedId ||
					annotation instanceof javax.persistence.JoinColumn ||
					annotation instanceof javax.persistence.JoinColumns ){
				return false;
			}
		}
		return true;
	}

	/**
	 * 更新列表.（新数据对象更新到旧数据对象）
	 * @param listSource
	 * 				传入的源对象（新数据对象）
	 * @param listTarget
	 * 				传入的目标对象（旧数据对象）
	 * @param isCopyNull
	 * 				是否拷贝null(当source中的值为null时，如果isCopyNull=ture,则用null,否则继续使用target中的值）
	 * @param parent
	 * 				listTarget的父层对象
	 * @throws Exception
	 */
	public void mergeList(List listSource, List listTarget, boolean isCopyNull, Object parent) throws Exception {
		Class clazz = null;
		if (listSource==null)
			return;
		if(listSource.size()>0){
			clazz = listSource.get(0).getClass();
		}else if(listTarget.size()>0){
			clazz = listTarget.get(0).getClass();
		}

		if(clazz==null){
			return ;
		}

		AnnotationMethod annMethod = getAnnMethod(clazz,parent);
		Method idMethod = annMethod.getIdMethod();
		Method refMethod = annMethod.getRefMethod();
		Map<Object, Object> mapSource = new HashMap<Object, Object>();
		Map<Object, Object> mapTarget = new HashMap<Object, Object>();
		Object[] params = new Object[0];
		String refSetMethod = "set"+refMethod.getName().substring(3);

		for (Object element : listSource) {
			Object key = idMethod.invoke(element,params);
			mapSource.put(key, element);
			key=null;
			element=null;
		}

		for (Object element : listTarget) {
			Object key = idMethod.invoke(element,params);
			mapTarget.put(key, element);
			key=null;
			element=null;
		}

		for (Iterator it = listTarget.iterator(); it.hasNext();) {
			Object element = it.next();
			Object key = idMethod.invoke(element,params);
			if (!mapSource.containsKey(key)) {
				service.delete(element);
				it.remove();
				service.flush();
			} else {
				mergeObject(mapSource.get(key), element,isCopyNull);
			}
			key=null;
			element=null;
		}

		Class[] setParamsClasses = {parent.getClass()};
		Object[] setParams = {parent};

		for (Object element : listSource) {
			Object key = idMethod.invoke(element,params);
			if (key == null || !mapTarget.containsKey(key)) {
				listTarget.add(element);
				BeanUtils.invoke(element, refSetMethod, setParamsClasses,setParams);
			}
			key=null;
			element=null;
		}
	}

	/**
	 * 更新对象.（新数据对象更新到旧数据对象）
	 *
	 * @param source
	 *            传入的源对象（新数据对象）
	 * @param target
	 *            传入的目标对象（旧数据对象）
	 * @param isCopyNull
	 *            是否拷贝null(当source中的值为null时，如果isCopyNull=ture,则用null,否则继续使用target中的值）
	 * @throws Exception
	 */
	public void mergeObject(Object source, Object target, boolean isCopyNull) throws Exception {
		if (target == null || source == null) {
			return;
		}
		List<Method> getterMethodList = BeanUtils.getGetter(source.getClass());
		List<Method> setterMethodList = BeanUtils.getSetter(target.getClass());

		Map<String, Method> map = new HashMap<String, Method>();
		for (Method method : getterMethodList) {
			map.put(method.getName(), method);
		}
		for (Method method: setterMethodList) {
			String fieldName = method.getName().substring(3);
			Method getterMethod = (Method) map.get("get" + fieldName);
			if (getterMethod == null) {
				getterMethod = (Method) map.get("is" + fieldName);
			}
			if (getterMethod == null) {
				continue;
			}

			if(!needHandleMethod(getterMethod)){
				continue;
			}

			if (!supportTypeMap.containsKey(getterMethod.getReturnType())) {
				logger.warn("not supprot type: "+getterMethod.getReturnType());
				continue;
			}

			Object value = getterMethod.invoke(source, new Object[0]);
			if (getterMethod.getReturnType()==java.util.List.class) {
				Object target_value = getterMethod.invoke(target, new Object[0]);
				mergeList((java.util.List)value,(java.util.List)target_value,isCopyNull,target);
				continue;
			}


			if (isCopyNull) {
				method.invoke(target, new Object[] { value });
			} else {
				if (value != null) {
					method.invoke(target, new Object[] { value });
				}
			}
			getterMethod=null;
		}//end for
	}
}

class AnnotationMethod {

	private Method idMethod;
	private Method refMethod;

	public AnnotationMethod(){
	}

	public AnnotationMethod(Method idMethod, Method refMethod) {
		this.idMethod = idMethod;
		this.refMethod = refMethod;
	}

	public Method getIdMethod() {
		return idMethod;
	}
	public void setIdMethod(Method idMethod) {
		this.idMethod = idMethod;
	}
	public Method getRefMethod() {
		return refMethod;
	}
	public void setRefMethod(Method refMethod) {
		this.refMethod = refMethod;
	}

	public String toString(){
		return idMethod+","+refMethod;
	}
}

class AnnotationField {

	private Field idField;
	private Field refField;

	public AnnotationField(){
	}

	public Field getIdField() {
		return idField;
	}

	public void setIdField(Field idField) {
		this.idField = idField;
	}

	public Field getRefField() {
		return refField;
	}

	public void setRefField(Field refField) {
		this.refField = refField;
	}

	public AnnotationField(Field idField, Field refField) {
		this.idField = idField;
		this.refField = refField;
	}


}
