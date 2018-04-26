package com.sinosoft.unwrt.service;

import com.sinosoft.unwrt.model.Customer;
import com.sinosoft.unwrt.remoteservice.service.FccbSaveService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.Collection;
import java.util.List;

@Service
public class BaseService extends HibernateDaoSupport {


    public static ThreadLocal<String> remoteThreadLocal = new ThreadLocal<String>();
    @Autowired
    private FccbSaveService fccbSaveService;

    @Autowired
    public void injectSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Transactional(rollbackFor = Exception.class)
    public Object save(Object obj) {
        Object o =  super.getHibernateTemplate().save(obj);
        Object result = fccbSaveService.savePolicy((Customer)obj);

        return o;
    }

    public List findByHql(String hql, final Object... values)
    {
        Assert.hasText(hql);

        String newHql = hql;
        int pos = 0;
        if (values != null) {
            for (int i = 0; i < values.length; i++)
            {
                pos = newHql.indexOf('?', pos);
                if (pos == -1) {
                    break;
                }
                if (((values[i] instanceof Collection)) && (pos > -1)) {
                    newHql = newHql.substring(0, pos) + ":queryParam" + i + newHql.substring(pos + 1);
                }
                pos += 1;
            }
        }
        final String fnHql = newHql;

        List list =(List)getHibernateTemplate().execute(new HibernateCallback()
        {
            public Object doInHibernate(Session session)
            {
                Query query = session.createQuery(fnHql);
                if (values != null) {
                    for (int i = 0; i < values.length; i++) {
                        if ((values[i] instanceof Collection)) {
                            query.setParameterList("queryParam" + i, (Collection)values[i]);
                        } else {
                            query.setParameter(i, values[i]);
                        }
                    }
                }
                return query.list();
            }
        });
        return list;
    }

    public List findTopByHql(String hql, final int top, final Object... values)
    {
        String newHql = hql;
        int pos = 0;
        if (values != null) {
            for (int i = 0; i < values.length; i++)
            {
                pos = newHql.indexOf('?', pos);
                if (pos == -1) {
                    break;
                }
                if (((values[i] instanceof Collection)) &&
                        (pos > -1)) {
                    newHql = newHql.substring(0, pos) + ":queryParam" + i + newHql.substring(pos + 1);
                }
                pos += 1;
            }
        }
        final String fnHql = newHql;

        List list = (List)super.getHibernateTemplate().execute(new HibernateCallback()
        {
            public Object doInHibernate(Session session)
            {
                Query query = session.createQuery(fnHql);
                if (values != null) {
                    for (int i = 0; i < values.length; i++) {
                        if ((values[i] instanceof Collection)) {
                            query.setParameterList("queryParam" + i, (Collection)values[i]);
                        } else {
                            query.setParameter(i, values[i]);
                        }
                    }
                }
                query.setFirstResult(0);
                query.setMaxResults(top);
                return query.list();
            }
        });
        return list;
    }



}
