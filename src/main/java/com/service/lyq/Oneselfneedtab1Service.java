package com.service.lyq;

import com.dao.lyq.Oneselfneedtab1DAO;
import com.entity.lyq.Oneselfneedtab1;
import com.utils.PageList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Oneselfneedtab1Service {

    @Resource
    private Oneselfneedtab1DAO dao;

    public PageList queryByPage(Integer pageNum,Integer pageSize){
        List<Oneselfneedtab1> list = dao.queryByPage((pageNum-1)*pageSize,pageSize);
        Long rowNum = dao.rowNum();
        PageList p = new PageList(rowNum,list);
        return p;
    }

    public Oneselfneedtab1 queryById(Integer needId){
        return dao.queryById(needId);
    }
}
