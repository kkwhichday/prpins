package com.sinosoft.unwrt.web;


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
        List<Customer> list = new ArrayList<Customer>();
        try {
            list = fccbSaveService.findPolicy();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;

    }

}
