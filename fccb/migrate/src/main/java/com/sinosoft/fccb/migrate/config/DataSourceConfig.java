package com.sinosoft.fccb.migrate.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "prpins")
    @Primary   //默认数据源
    @ConfigurationProperties(prefix = "spring.datasource.prpins")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "migrate")
    @ConfigurationProperties(prefix = "spring.datasource.migrate")
    public DataSource oracleDataSource() {
        return DataSourceBuilder.create().build();
    }

}
