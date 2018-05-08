package com.sinosoft.unwrt.web;


import com.netflix.hystrix.exception.HystrixRuntimeException;
import com.sinosoft.prpins.common.exception.BusinessException;
import com.sinosoft.prpins.common.exception.HystrixExceptionHandler;
import com.sinosoft.unwrt.model.Customer;
import com.sinosoft.unwrt.remoteservice.service.FccbSaveService;
import com.sinosoft.unwrt.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Api("demo 接口")
@RestController
public class DemoController {


    @Autowired
    BaseService baseService;

    @Autowired
    private FccbSaveService fccbSaveService;
    @Value("${server.port}")
    String port;


    @ApiOperation(value = "保存客户信息", notes = "保存用户详细信息")
    @RequestMapping("/save")
    public String save() {
        Customer customer = new Customer();
        customer.setFirst_name("中国人");
        try {
            baseService.save(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return customer.toString();

    }

    @RequestMapping("/find")
    public List<Customer> find() {
        long startTime = System.currentTimeMillis();
        List<Customer> list = new ArrayList<Customer>();
        try {
            list = fccbSaveService.findPolicy();
        }catch (HystrixRuntimeException e) {
            Throwable th = e.getFallbackException().getCause().getCause();
            if(th.getMessage().equals(HystrixExceptionHandler.TIMEOUTEXCEPTION)){
                throw e;
            }else if(th.getMessage().equals(HystrixExceptionHandler.BUSINESSEXCEPTION)){

            }
            long endTime = System.currentTimeMillis();

            float seconds = (endTime - startTime) / 1000F;
            System.out.println("exception"+e.getClass()+" seconds======="+seconds);
            System.out.println(e.getFallbackException().getCause().getCause() instanceof BusinessException);
            System.out.println(e.getFallbackException().getCause().getCause().getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();

        float seconds = (endTime - startTime) / 1000F;
        System.out.println("list="+list+" seconds======="+seconds);
        return list;

    }

}
