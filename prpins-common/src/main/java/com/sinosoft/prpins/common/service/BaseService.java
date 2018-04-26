package com.sinosoft.prpins.common.service;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Service
public class BaseService extends HibernateDaoSupport {




    @Autowired
    public void injectSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Transactional(rollbackFor = Exception.class)
    public Object save(Object obj) {
        Object o =  super.getHibernateTemplate().save(obj);

        return o;
    }

    @Transactional(rollbackFor = Exception.class)
    public void update(Object obj)
    {
        getHibernateTemplate().update(obj);
    }

    @Transactional(rollbackFor = Exception.class)
    public void merge(Object obj)
    {
        getHibernateTemplate().merge(obj);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(Object obj)
    {
        getHibernateTemplate().delete(obj);
    }

    @Transactional(rollbackFor = Exception.class)
    public <T> void deleteAll(List entityList)
    {
        getHibernateTemplate().deleteAll(entityList);
    }

    @Transactional(rollbackFor = Exception.class)
    public <T> void deleteByPK(Class<T> entityClass, Serializable id)
    {
        Object obj = get(entityClass, id);
        if (obj != null) {
            delete(obj);
        }
    }
    @Transactional(rollbackFor = Exception.class)
    public <T> T get(Class<T> entityClass, Serializable id)
    {
        return getHibernateTemplate().get(entityClass, id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void flush()
    {
        getHibernateTemplate().flush();
    }

    @Transactional(rollbackFor = Exception.class)
    public void evict(Object obj)
    {
        getHibernateTemplate().evict(obj);
    }

    @Transactional(rollbackFor = Exception.class)
    public void clear()
    {
        getHibernateTemplate().clear();
    }



    @Transactional(rollbackFor = Exception.class)
    public List findByHql(String hql, final Object... values)
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
                if (((values[i] instanceof Collection)) && (pos > -1)) {
                    newHql = newHql.substring(0, pos) + ":queryParam" + i + newHql.substring(pos + 1);
                }
                pos += 1;
            }
        }
        final String fnHql = newHql;

        List list =(List)getHibernateTemplate().execute((Session session)->{
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
        });
        return list;
    }

    @Transactional(rollbackFor = Exception.class)
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



    @Transactional(rollbackFor = Exception.class)
    public Serializable findByHqlOne(String hql, final Object... values)
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
        return (Serializable)list.get(0);
    }

}
