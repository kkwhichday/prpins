package com.sinosoft.fccb.policy.web;



import com.sinosoft.fccb.policy.service.PolicyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("demo 接口")
@RestController
public class DemoController {


    @Autowired
    PolicyService policyService;


    @Value("${server.port}")
    String port;


    @ApiOperation(value = "保存客户信息", notes = "保存用户详细信息")
    @RequestMapping("/save")
    public String save() {
       /* Customer customer = new Customer();
        customer.setFirst_name("3333");
        try {
            policyService.savePolicy(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return customer.toString();*/
       return null;

    }

}
