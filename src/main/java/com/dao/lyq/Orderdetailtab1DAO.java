package com.dao.lyq;

import com.entity.lyq.Orderdetailtab1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Orderdetailtab1DAO {
    @Select("select * from orderdetailtab")
    List<Orderdetailtab1> queryAll();

    @Select("select * from orderdetailtab where orderId=#{orderId}")
    List<Orderdetailtab1> queryById(Integer orderId);

    @Insert("INSERT INTO `traveldb`.`orderdetailtab` (`orderID`, `clientID`, `name`, `phone`, `idCard`, `age`, `sex`) VALUES (#{orderId}, #{clientId}, #{name}, #{phone}, #{idCard}, #{age}, #{sex})")
    @Options(useGeneratedKeys = true, keyProperty = "detailId", keyColumn = "detailId")
    int add(Orderdetailtab1 detail);
}
