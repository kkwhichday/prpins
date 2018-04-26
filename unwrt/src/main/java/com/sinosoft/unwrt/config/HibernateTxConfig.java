package com.sinosoft.unwrt.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
@EnableJpaRepositories(entityManagerFactoryRef = "prpinsEntityManagerFactory", transactionManagerRef = "prpinsTransactionManager", basePackages = { "com.sinosoft.unwrt" })
public class HibernateTxConfig {



    @Bean(name = "prpins")
    @Primary   //默认数据源
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Autowired
    private DataSource dataSource;


    @Bean(name = "prpinsEntityManagerFactory")
    @Primary   //默认数据源
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(EntityManagerFactoryBuilder builder) {

        Map<String, Object> jpaProperties = new HashMap<String, Object>();
        jpaProperties.put("hibernate.ejb.naming_strategy","org.hibernate.cfg.ImprovedNamingStrategy");
        jpaProperties.put("hibernate.jdbc.batch_size",50);
        jpaProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");

        return builder.dataSource(dataSource)
                .properties(jpaProperties)
                .packages("com.sinosoft.unwrt")
                .build();
    }

    @Bean(name = "prpinsSessionFactory")
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
