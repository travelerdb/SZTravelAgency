package com.dao.lyq;


import com.entity.lyq.Emptab1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmptabDAO {
    @Select("select * from emptab e where e.empid=#{empid}")
    @Results({
            @Result(property = "role", column = "roleId",one = @One(select =
                    "com.dao.lyq.Roletab1DAO.queryById"))
    })
    Emptab1 queryById(Long empid);

    @Select("select * from emptab")
    List<Emptab1> queryAll();
}
