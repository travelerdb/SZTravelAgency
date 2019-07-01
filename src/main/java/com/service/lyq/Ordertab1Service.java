package com.service.lyq;

import com.dao.lyq.Ordertab1DAO;
import com.entity.lyq.Ordertab1;
import com.utils.PageList;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Ordertab1Service {
    @Resource
    private Ordertab1DAO dao;

    public PageList queryByPage(Integer pageNum, Integer pageSize){
        List<Map<String,Object>> list = dao.queryByPage((pageNum-1)*pageSize,pageSize);
        Long rowNum = dao.rowNum();
        PageList p = new PageList(rowNum,list);
        return p;
    }

    public int add(Ordertab1 order){
        dao.add(order);
        //返回主键
        return (int) order.getOrderId();
    }
}
