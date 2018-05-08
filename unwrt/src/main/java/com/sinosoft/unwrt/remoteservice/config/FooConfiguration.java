package com.sinosoft.unwrt.remoteservice.config;

import feign.Contract;
import feign.Feign;
import feign.FeignException;
import feign.Response;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import org.springframework.cloud.netflix.feign.support.ResponseEntityDecoder;
import org.springframework.cloud.netflix.feign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.lang.reflect.Type;


//@Configuration
public class FooConfiguration {

//    @Bean
//    @Scope("prototype")
//    public Feign.Builder feignContract() {
//        return Feign.builder();
//    }
/*
    @Bean
    public Decoder myDecoder() {
        return new Decoder() {

            public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {

                if (response.status() == 404) {
                    return new NotFoundException(
                            response.status(),
                            response.reason()
                    );
                }
                return errorStatus(methodKey, response);
            }
        };
    }*/

}