package com.service.lyq;

import com.dao.lyq.Combotab1DAO;
import com.entity.lyq.Combotab1;
import com.entity.lyq.Oneselfneedtab1;
import com.utils.PageList;
import com.utils.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Combotab1Service {
    @Resource
    private Combotab1DAO dao;

    public PageList queryByPage(Integer pageNum, Integer pageSize){
        List<Combotab1> list = dao.queryByPage((pageNum-1)*pageSize,pageSize);
        Long rowNum = dao.rowNum();
        PageList p = new PageList(rowNum,list);
        return p;
    }

    //前台主页面套餐显示
    public List<Combotab1> queryByDolId(Integer dolId){
        return dao.queryByDolId(dolId);
    }

    //
    public PageUtil<Combotab1> queryByDolIdByPage(Integer dolId, Integer pageNum, Integer pageSize){

        if (null == pageNum || pageNum < 1) {
            pageNum=1;
        }
        if (null == pageSize) {
            pageSize=4;
        }
        // 查询分页数据
        List<Combotab1> list=dao.queryByDolIdByPage(dolId, (pageNum-1)*pageSize, pageSize);

        // 获取总行数
        Long counts = dao.getCounts(dolId);

        // 总页数
        Integer pageCounts = 0;

        // 返回总页数
        // 1.总行数和每页显示数据行数是否能整出
        if ((counts % pageSize) == 0) {
            // 2.总页数 = 总行数/每页显示数据行数
            pageCounts = counts.intValue() / pageSize;
        } else {
            // 3.总页数 = 总行数/每页显示数据行数+1
            pageCounts = counts.intValue() / pageSize + 1;
        }

        PageUtil<Combotab1> p = new PageUtil<Combotab1>(list, pageNum, pageCounts,counts);

        return p;
    }

    public int add(Combotab1 combo){
        dao.add(combo);
        //返回主键
        return (int) combo.getComboId();
    }
}
