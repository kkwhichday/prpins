package com.sinosoft.fccb.migrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MigrateServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MigrateServiceApplication.class, args);
    }

}
