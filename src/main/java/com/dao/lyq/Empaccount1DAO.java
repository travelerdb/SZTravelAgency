package com.dao.lyq;

import com.entity.lyq.Empaccount1;
import org.apache.ibatis.annotations.*;

@Mapper
public interface Empaccount1DAO {
    //登录
    @Select("select account.*,e.empName from empaccount account left join emptab e on account.empID=account.empID where accNum=#{param1}")
    /*@Results({
            @Result(property = "emp", column = "operaId",many = @Many(select =
                    "com.dao.lyq.EmptabDAO.queryById"))})*/
    Empaccount1 login(String accNum);
}
