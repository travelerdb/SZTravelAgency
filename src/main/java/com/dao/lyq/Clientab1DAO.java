package com.dao.lyq;

import com.entity.lyq.Clientab1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Clientab1DAO {

    @Select("select * from clientab where clientId=#{clientId}")
    Clientab1 queryById(Long clientId);
}
