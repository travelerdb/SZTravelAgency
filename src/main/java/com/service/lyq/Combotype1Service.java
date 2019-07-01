package com.service.lyq;

import com.dao.lyq.Combotype1DAO;
import com.entity.lyq.Combotype1;
import com.utils.PageList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Combotype1Service {

  @Resource
  private Combotype1DAO dao;

  public PageList queryByPage(Integer pageNum, Integer pageSize){
    List<Combotype1> list = dao.queryByPage((pageNum-1)*pageSize,pageSize);
    Long rowNum = dao.rowNum();
    PageList p = new PageList(rowNum,list);
    return p;
  }

  public List<Combotype1> queryAll(){
    return dao.queryAll();
  }

}
