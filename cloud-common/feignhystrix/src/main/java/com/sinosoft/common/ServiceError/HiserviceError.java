package com.sinosoft.common.ServiceError;


import com.sinosoft.common.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiserviceError implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }
}
