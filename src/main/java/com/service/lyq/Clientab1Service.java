package com.service.lyq;

import com.dao.lyq.Clientab1DAO;
import com.entity.lyq.Clientab1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Clientab1Service {
    @Resource
    private Clientab1DAO dao;

    public Clientab1 queryById(Long clientId){
        return dao.queryById(clientId);
    }
}
