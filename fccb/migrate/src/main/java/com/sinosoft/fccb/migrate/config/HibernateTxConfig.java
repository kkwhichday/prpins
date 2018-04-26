package com.sinosoft.fccb.migrate.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "prpinsEntityManagerFactory", transactionManagerRef = "prpinsTransactionManager", basePackages = { "com.sinosoft.fccb.migrate.model" })
public class HibernateTxConfig {


    @Autowired
    @Qualifier("prpins")
    private DataSource dataSource;

    @Bean
    public OpenSessionInViewFilter openEntityManagerInViewFilter(){
        OpenSessionInViewFilter openSessionInViewFilter =  new OpenSessionInViewFilter();
        openSessionInViewFilter.setSessionFactoryBeanName("sessionFactory");
        return openSessionInViewFilter;
    }


    @Bean(name = "prpinsEntityManagerFactory")
    @Primary   //默认数据源
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(EntityManagerFactoryBuilder builder) {

        Map<String, Object> jpaProperties = new HashMap<String, Object>();
        jpaProperties.put("hibernate.ejb.naming_strategy","org.hibernate.cfg.ImprovedNamingStrategy");
        jpaProperties.put("hibernate.jdbc.batch_size",50);
        jpaProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        jpaProperties.put("hibernate.bytecode.provider","cglib");

        return builder.dataSource(dataSource)
                .properties(jpaProperties)
                .packages("com.sinosoft.fccb.migrate.model")
                .build();
    }

    @Bean(name = "sessionFactory")
    @Primary   //默认数据源
    public SessionFactory getSessionFactory(EntityManagerFactoryBuilder builder){
       return  customerEntityManagerFactory(builder).getObject().unwrap(SessionFactory.class);
    }

    @Bean(name = "prpinsTransactionManager")
    @Primary   //默认数据源
    public PlatformTransactionManager transactionManagerPrpins(EntityManagerFactoryBuilder builder) {

        return new HibernateTransactionManager(getSessionFactory(builder));
    }

}
