package com.sinosoft.fccb.policy.common.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PrpPmainCommon
 */
@Entity
@Table(name = "prppmain_common")
public class PrpPmainCommon implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	/** 批单申请号 */
	private String applyNo;
	/** 批单申请号 */
	private PrpPhead prpPhead;
	/** 批单号 */
	private String endorseNo;
	/** 保单号 */
	private String policyNo;
	/** 审核状态 */
	private String specialFlag;
	private String ext1;
	private String ext2;
	private String ext3;
	//RYANGQH2012111401 增加推荐送修码的选项 add by hanzhiwei 2013-01-07 begin
	/** 资源分配码 */
	private String resourceCode;
	/** 资源分配名称 */
	private String resourceName;
	//RYANGQH2012111401 增加推荐送修码的选项 add by hanzhiwei 2013-01-07 end
	private Date insertTimeForHis;
	private Date operateTimeForHis;
	//RZHANGT2012121202 新业务来源及周边系统接口变更 add by zhangzemin 2012-12-16 start
	/**** 新业务来源*/
	private String newBusinessNature;
	private String scmsAuditNotion;
	//RZHANGT2012121202 新业务来源及周边系统接口变更 add by zhangzemin 2012-12-16 end
	//RYANGQH2012122502 非车配合车险调整表结构 add by zhuq 2012-12-31 start
	private String pay_method;
	//RYANGQH2012122502 非车配合车险调整表结构 add by zhuq 2012-12-31 end
	//RLIUBIN2013061701 意外健康险各外接系统全面增加平台与项目标识 add by  wangxy 2013-08-12 begin
	private String platformProjectCode ;
	//RLIUBIN2013061701 意外健康险各外接系统全面增加平台与项目标识 add by  wangxy 2013-08-12 end
	//RZHANGT2014061201:“统一工号”系统改造，接口提供方改造 add by dongrui  2014-7-23 begin
	// 归属人集团代码
	private String handler1Code_uni;
	// 经办人集团代码
	private String handlerCode_uni;
	//RZHANGT2014061201:“统一工号”系统改造，接口提供方改造 add by dongrui  2014-7-23 end
	//RLIANGJZ2015082502_04 BFC、BFD、BFE、UBA、UBB、UBC产品联保业务核保流程调整 add by huangna 20151029 begin
	private String commonFlag;
	//RLIANGJZ2015082502_04 BFC、BFD、BFE、UBA、UBB、UBC产品联保业务核保流程调整 add by huangna 20151029 end
	//201607075-005,基本信息界面增加“个性产品名称”字段   add by guanyongliang 2016-09-13 begin
	/** 个性产品名称 */
	private String otherPolicyName;
	//201607075-005,基本信息界面增加“个性产品名称”字段   add by guanyongliang 2016-09-13 end
	public PrpPmainCommon(){
		
	}
	
	/**       
	 * 批单申请号
	 */
	@Id
	@Column(name = "applyno", unique = true, nullable = false)
	public String getApplyNo() {
		return this.applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	/**       
	 * 批单申请号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applyno", unique = true, nullable = false, insertable = false, updatable = false)
	public PrpPhead getPrpPhead() {
		return this.prpPhead;
	}

	public void setPrpPhead(PrpPhead prpPhead) {
		this.prpPhead = prpPhead;
	}

	/**       
	 * 批单号
	 */

	@Column(name = "endorseno")
	public String getEndorseNo() {
		return this.endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}

	/**       
	 * 保单号
	 */

	@Column(name = "policyno", nullable = false)
	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	/** 
	 * 审核状态 
	 */
	@Column(name = "specialflag")
	public String getSpecialFlag() {
		return specialFlag;
	}

	public void setSpecialFlag(String specialFlag) {
		this.specialFlag = specialFlag;
	}
	@Column(name = "ext1")
	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	@Column(name = "ext2")
	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	@Column(name = "ext3")
	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}

	@Column(name = "inserttimeforhis", insertable = false, updatable = false)
	public Date getInsertTimeForHis() {
		return insertTimeForHis;
	}

	public void setInsertTimeForHis(Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}

	@Column(name = "operatetimeforhis", insertable = false)
	public Date getOperateTimeForHis() {
		return operateTimeForHis;
	}

	public void setOperateTimeForHis(Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}
	@Column(name = "scmsAuditNotion")
	public String getScmsAuditNotion() {
		return scmsAuditNotion;
	}

	public void setScmsAuditNotion(String scmsAuditNotion) {
		this.scmsAuditNotion = scmsAuditNotion;
	}
	@Column(name = "newBusinessNature")
	public String getNewBusinessNature() {
		return newBusinessNature;
	}

	public void setNewBusinessNature(String newBusinessNature) {
		this.newBusinessNature = newBusinessNature;
	}
	@Column(name = "pay_method")
	public String getPay_method() {
		return pay_method;
	}

	public void setPay_method(String pay_method) {
		this.pay_method = pay_method;
	}

	@Column(name = "resourceCode")
	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	@Column(name = "resourceName")
	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
	@Column(name = "otherPolicyName")
	public String getOtherPolicyName() {
		return otherPolicyName;
	}

	public void setOtherPolicyName(String otherPolicyName) {
		this.otherPolicyName = otherPolicyName;
	}

	/**
	 * @function 
	 * @author 张泽民
	 * @日期：Apr 10, 2013
	 * @param source
	 * @param index
	 * @return void
	 */
	public void ssetSpecialFlagByIndex(char source,int index) {
		if(null==specialFlag){
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<index;i++){
				sb.append(' ');
			}
			sb.append(source);
			this.specialFlag = sb.toString();
		}else{
			StringBuffer sb=new StringBuffer(specialFlag);
			int length=specialFlag.length();
			if((length-1)>=index){
				//RYANGQH2013032001 QAN、QAO、QDF、QEH CBI条款标志 增加标志位 modiy by zhuq 2013-4-16 start
//				StringBuilder sbb=new StringBuilder(String.valueOf(source));
				StringBuilder sbb=new StringBuilder(String.valueOf(source));
				//RYANGQH2013032001 QAN、QAO、QDF、QEH CBI条款标志 增加标志位 modiy by zhuq 2013-4-16 end
				sb.replace(index, index+1, sbb.toString());
			}else{
				for(int i=0;i<index-length;i++){
					sb.append(' ');
				}
				sb.append(source);
			}
			this.specialFlag = sb.toString();
		}
	}
	/**
	 * @function 
	 * @author 张泽民
	 * @日期：Apr 10, 2013
	 * @param index
	 * @return String
	 */
	public String ggetSpecialFlagByIndex(int index) {
		if((specialFlag.length()-1)>=index){
			return specialFlag.substring(index, index+1);
		}else{
			return null;
		}
	}
	@Column(name = "platformprojectcode")
	public String getPlatformProjectCode() {
		return platformProjectCode;
	}

	public void setPlatformProjectCode(String platformProjectCode) {
		this.platformProjectCode = platformProjectCode;
	}

	@Column(name = "handler1Code_uni")
	public String getHandler1Code_uni() {
		return handler1Code_uni;
	}

	public void setHandler1Code_uni(String handler1Code_uni) {
		this.handler1Code_uni = handler1Code_uni;
	}

	@Column(name = "handlerCode_uni")
	public String getHandlerCode_uni() {
		return handlerCode_uni;
	}

	public void setHandlerCode_uni(String handlerCode_uni) {
		this.handlerCode_uni = handlerCode_uni;
	}
    @Column(name = "commonFlag")
	public String getCommonFlag() {
		return commonFlag;
	}

	public void setCommonFlag(String commonFlag) {
		this.commonFlag = commonFlag;
	}
}
