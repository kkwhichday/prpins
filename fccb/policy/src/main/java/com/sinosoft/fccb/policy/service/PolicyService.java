package com.sinosoft.fccb.policy.service;
import com.sinosoft.prpins.common.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PolicyService  extends BaseService {

    @Transactional(rollbackFor = Exception.class)
    public void savePolicy(Object obj){
        //super.save(obj);
    }
}
