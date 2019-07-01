package com.service.lyq;

import com.dao.lyq.Empaccount1DAO;
import com.entity.lyq.Empaccount1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Empaccount1Service {
    @Resource
    private Empaccount1DAO empaccount;

    public Empaccount1 login(String accNum){
        return empaccount.login(accNum);
    }
}
