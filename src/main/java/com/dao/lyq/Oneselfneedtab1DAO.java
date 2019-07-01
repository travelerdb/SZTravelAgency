package com.dao.lyq;

import com.entity.lyq.Oneselfneedtab1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Oneselfneedtab1DAO {

    @Select("select need.*,c.name from Oneselfneedtab need left join clientab c on need.clientID=c.clientID limit #{param1},#{param2}")
    /*@Results({
            @Result(property = "clientId", column = "clientId"),
            @Result(property = "client", column = "clientId",one = @One(select =
                    "com.dao.lyq.Clientab1DAO.queryById"))
    })*/
    List<Oneselfneedtab1> queryByPage(Integer offset, Integer pageSize);

    @Select("select count(*) from Oneselfneedtab need left join clientab c on need.clientID=c.clientID")
    Long rowNum();

    @Select("select need.*,c.name from Oneselfneedtab need left join clientab c on need.clientID=c.clientID where need.needId=#{needId}")
    Oneselfneedtab1 queryById(Integer needId);

}
