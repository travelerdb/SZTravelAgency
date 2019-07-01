package com.service.lyq;

import com.dao.lyq.Orderdetailtab1DAO;
import com.entity.lyq.Orderdetailtab1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Orderdetailtab1Service {
    @Resource
    private Orderdetailtab1DAO dao;

    public List<Orderdetailtab1> queryAll(){
        return dao.queryAll();
    }

    public List<Orderdetailtab1> queryById(Integer orderId){
        return dao.queryById(orderId);
    }

    public int add(Orderdetailtab1 detail){
        dao.add(detail);
        //返回主键
        return (int) detail.getDetailId();
    }
}
