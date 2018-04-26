package com.sinosoft.unwrt.remoteservice.serviceerror;




import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.unwrt.model.Customer;
import com.sinosoft.unwrt.remoteservice.service.FccbSaveService;
import com.sinosoft.unwrt.service.BaseService;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HiserviceError  implements FallbackFactory<FccbSaveService> {
    @Autowired
    BaseService baseService;
    @Override
    public FccbSaveService create(Throwable cause){
        return new FccbSaveService(){
            @Override
                public Customer savePolicy(Customer customer){

                //new ObjectMapper().readValue(cause.getMessage(), valueType);
                //可以抛出异常，强制事务回滚
                // 也可以降级处理，设置一个返回值，具体根据业务场景需要选择
                System.out.println("异常信息为: "+cause.getMessage());
                if(true)
                throw new RuntimeException("error,remote service failed!"+cause.getMessage());
                return null;
            }

            @Override
            public List<Customer> findPolicy() {
                if(true)
                    throw new RuntimeException("error,remote service failed!"+cause.getMessage());
                return null;
            }
        };
    }



}
