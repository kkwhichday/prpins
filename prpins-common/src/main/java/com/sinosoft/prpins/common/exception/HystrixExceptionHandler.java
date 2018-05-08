package com.sinosoft.prpins.common.exception;

import com.netflix.hystrix.exception.HystrixTimeoutException;
import feign.FeignException;

public class HystrixExceptionHandler {

    public static String BUSINESSEXCEPTION = "01";
    public static String TIMEOUTEXCEPTION = "02";
    public static void handler(Throwable cause) throws Exception{
        if(cause instanceof FeignException){
            throw new BusinessException(BUSINESSEXCEPTION,cause);
        }
        if(cause instanceof HystrixTimeoutException)
            throw new BusinessException(TIMEOUTEXCEPTION,cause);
    }
}
