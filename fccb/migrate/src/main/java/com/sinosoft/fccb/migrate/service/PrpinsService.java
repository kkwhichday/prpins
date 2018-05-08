package com.sinosoft.fccb.migrate.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.fccb.migrate.model.Customer;
import com.sinosoft.fccb.migrate.model.Customer2;
import com.sinosoft.fccb.migrate.model.Customer3;
import com.sinosoft.fccb.migrate.util.Loader;
import com.sinosoft.fccb.migrate.util.PojoMerge;
import com.sinosoft.prpins.common.service.BaseService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PrpinsService extends BaseService {



    @Transactional(rollbackFor = Exception.class)
    public Object save(Object obj){

        /*if(true)
        throw new RuntimeException("service failed");*/
        return super.save(obj);
    }

    @Transactional(rollbackFor = Exception.class)
    public  List<Customer> find() throws Exception {
        List<Customer> list = super.getHibernateTemplate().loadAll(Customer.class);
        Customer customera = (Customer) list.get(0);

        customera.getCustomer2s().get(0).setFirst_name("xiugai111");
        try {
            setSth(customera);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }


        //if(true){

        //customera.getCustomer2s().get(0);
        //Customer3 customera3 = (Customer3) this.findByHqlOne("from Customer3");
//        super.getHibernateTemplate().evict(customera.getCustomer2s().get(0));
//        super.getHibernateTemplate().evict(customera.getCustomer2s().get(1));
//        super.getHibernateTemplate().evict(customera3);
//        super.getHibernateTemplate().evict(customera);
//        super.getHibernateTemplate().update(customera);
        //customera.setCustomer2s(null);
        //Customer customera = (Customer) this.findByHqlOne("from Customer");
        //super.getHibernateTemplate().flush();
        //}

        //customera = (Customer) this.save(customera);
//        customera.getCustomer2s().get(0).getCustomer3s().remove(0);
//        customera.setFirst_name("mmmmhhhhh");
//        this.update(customera);
        //super.getSessionFactory().getCurrentSession().update(customera);
//this.delete(list.get(0).getCustomer2s().get(0).getCustomer3s().get(0));
//this.save(list)
        /*PojoMerge pojoMerge = new PojoMerge(this);
        Customer customer  = new Customer();
        customer.setId(1);
        customer.setFirst_name("merge me");
        Customer2 customer2 = new Customer2();
        customer2.setCid(222);
        customer2.setFirst_name("merge me2");
        Customer3 customer3 = new Customer3();
        customer3.setCid(333);
        customer3.setFirst_name("merge me3");
        List<Customer3> customer3s = new ArrayList<Customer3>();
        customer3s.add(customer3);
        customer2.setCustomer3s(customer3s);
        customer3.setCustomer2(customer2);
        customer3.setId(222);
        List<Customer2> customer2s = new ArrayList<Customer2>();
        customer2s.add(customer2);
        customer.setCustomer2s(customer2s);
        customer2.setCustomer(customer);
        customer2.setId(1);
        try {
            pojoMerge.mergeObject(customer,customera,false);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }*/
        /*Customer customera2 = (Customer) this.findByHqlOne("from Customer");
        ObjectMapper mapper = new ObjectMapper();*/
        //普通输出
        //System.out.println(mapper.writeValueAsString(customera2));
        //格式化/美化/优雅的输出
        //System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customera2));
        return list;
    }

    @Transactional(rollbackFor = Exception.class)
    public void setSth(Customer customera) throws Exception {
        customera.getCustomer2s().get(0).setFirst_name("xiugai999");
//        if(true){
//            throw new Exception("hhhhh=====error");
//        }
    }


}
