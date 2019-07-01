package com.dao.lyq;

import com.entity.lyq.Combotype1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Combotype1DAO {

  @Select("select * from combotype limit #{param1},#{param2}")
  List<Combotype1> queryByPage(Integer offSet,Integer pageSize);

  @Select("select * from combotype")
  List<Combotype1> queryAll();

  @Select("select count(*) from combotype")
  Long rowNum();
}
