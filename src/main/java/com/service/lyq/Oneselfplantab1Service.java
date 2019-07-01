package com.service.lyq;

import com.dao.lyq.Oneselfplantab1DAO;
import com.entity.lyq.Oneselfplantab1;
import com.utils.PageList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Oneselfplantab1Service {
    @Resource
    private Oneselfplantab1DAO dao;

    public PageList queryByPage(Integer pageNum,Integer pageSize) {
        List<Oneselfplantab1> list = dao.queryByPage((pageNum - 1) * pageSize, pageSize);
        Long rowNum = dao.rowNum();
        PageList p = new PageList(rowNum, list);
        return p;
    }

    public int add(Oneselfplantab1 plan){
        return dao.add(plan);
    }

    public int update(Oneselfplantab1 plan){
        return dao.update(plan);
    }

    public int delete(Integer planId){
        return dao.delete(planId);
    }
}
