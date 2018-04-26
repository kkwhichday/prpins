package com.sinosoft.fccb.migrate.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "migrateEntityManagerFactory", transactionManagerRef = "migrateTransactionManager", basePackages = { "com.sinosoft.fccb" })
public class MigrateHibernateTxConfig {

    @Autowired
    @Qualifier("migrate")
    private DataSource dataSource;


    @Bean(name = "migrateEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(EntityManagerFactoryBuilder builder) {

        Map<String, Object> jpaProperties = new HashMap<String, Object>();
        jpaProperties.put("hibernate.ejb.naming_strategy","org.hibernate.cfg.ImprovedNamingStrategy");
        jpaProperties.put("hibernate.jdbc.batch_size",50);
        jpaProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
        return builder.dataSource(dataSource)
                .properties(jpaProperties)
                .packages("com.sinosoft.fccb")
                .build();
    }

    @Bean(name = "migrateSessionFactory")
    public SessionFactory getSessionFactory(EntityManagerFactoryBuilder builder){
       return  customerEntityManagerFactory(builder).getObject().unwrap(SessionFactory.class);
    }

    @Bean(name = "migrateTransactionManager")
    public PlatformTransactionManager transactionManagerPrpins(EntityManagerFactoryBuilder builder) {

        return new HibernateTransactionManager(getSessionFactory(builder));
    }

}
