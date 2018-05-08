package com.sinosoft.fccb.migrate.web;



import com.sinosoft.fccb.migrate.model.Customer;
import com.sinosoft.fccb.migrate.service.MigrateService;
import com.sinosoft.fccb.migrate.service.PrpinsService;
import com.sinosoft.prpins.common.exception.BusinessException;
import com.sinosoft.prpins.common.service.BaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("demo 接口")
@RestController
public class DemoController {

    @Autowired
    PrpinsService prpinsService;

    @Autowired
    MigrateService migrateService;

    @Value("${server.port}")
    String port;


    @ApiOperation(value = "保存客户信息", notes = "保存用户详细信息")
    @RequestMapping("/save")
    public Customer save(@RequestBody Customer customer1) {
        Customer customer = new Customer();
        customer.setFirst_name("222");
        //baseService.save(customer1);
//        Customer customer2 = new Customer();
//        customer2.setFirst_name("222");
//        migrateService.save(customer2);

       // List<Customer> list = baseService.findByHql("from Customer a");
        return customer;

    }


    @RequestMapping("/find")
    public   List<Customer> find() throws BusinessException {

//        Customer customer2 = new Customer();
//        customer2.setFirst_name("222");
//        migrateService.save(customer2);

        List<Customer> list = null;
        //Customer list=null;
        try {
            list = prpinsService.find();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException("我抛异常!");
        }
        //List<Customer> list = baseService.findByHql("from Customer a");
        return list;

    }

}
