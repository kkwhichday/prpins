package com.sinosoft.unwrt.remoteservice.serviceerror;




import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.exception.HystrixTimeoutException;
import com.sinosoft.prpins.common.exception.BusinessException;
import com.sinosoft.prpins.common.exception.HystrixExceptionHandler;
import com.sinosoft.unwrt.model.Customer;
import com.sinosoft.unwrt.remoteservice.service.FccbSaveService;
import com.sinosoft.unwrt.service.BaseService;
import feign.FeignException;
import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HiserviceError  implements FallbackFactory<FccbSaveService> {

    @Override
        public FccbSaveService create(Throwable cause){
            return new FccbSaveService(){

                public Customer savePolicy(Customer customer) throws Exception {

                    //new ObjectMapper().readValue(cause.getMessage(), valueType);
                    //可以抛出异常，强制事务回滚
                    // 也可以降级处理，设置一个返回值，具体根据业务场景需要选择

                    HystrixExceptionHandler.handler(cause);
                    return null;
                }

                @Override
                public List<Customer> findPolicy() throws Exception {
                    System.out.println("降级处理"+cause);
                    HystrixExceptionHandler.handler(cause);
                    return null;
                }
            };
    }



}
