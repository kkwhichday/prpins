package com.sinosoft.unwrt.remoteservice.service;




import com.sinosoft.unwrt.model.Customer;
import com.sinosoft.unwrt.remoteservice.config.FooConfiguration;
import com.sinosoft.unwrt.remoteservice.serviceerror.HiserviceError;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "service-fccb", fallbackFactory = HiserviceError.class)
public interface FccbSaveService {
    @RequestMapping(value = "/save")
    public Customer savePolicy(Customer customer);

    @RequestMapping(value = "/find")
    public List<Customer> findPolicy();
}