package com.sinosoft.fccb.migrate.service;

import com.sinosoft.prpins.common.service.BaseService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MigrateService  extends HibernateDaoSupport {
    @Autowired
    @Qualifier("migrateSessionFactory")
    public void injectSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Transactional(value="migrateTransactionManager",rollbackFor = Exception.class)
    public Object save(Object obj){
        return super.getHibernateTemplate().save(obj);
    }
}
