package com.dao.lyq;

import com.entity.lyq.Comdoltype1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Comdoltype1DAO {

    /*@Select("select * from comdoltype limit #{param1},#{param2}")
    List<Comdoltype1> queryByPage(Integer offSet,Integer pageSize);*/

    @Select("select * from comdoltype where typeId=#{typeId}")
    List<Comdoltype1> queryByTypeId(Integer typeId);

    @Select("select count(*) from comdoltype")
    Long rowNum();
}
