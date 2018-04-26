package com.sinosoft.fccb.policy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class FccbPolicyServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FccbPolicyServiceApplication.class, args);
    }

}
