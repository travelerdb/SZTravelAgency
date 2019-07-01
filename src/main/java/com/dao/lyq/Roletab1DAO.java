package com.dao.lyq;

import com.entity.lyq.Roleper1;
import com.entity.lyq.Roletab1;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface Roletab1DAO {
    @Select(value="select role.* from emptab emp,empaccount account,roletab role " +
            "where emp.roleID=role.roleID and emp.empID=account.empID and account.accNum=#{accNum}")
    List<Roletab1> getRolesByUserName(String accNum);

    @Select("select * from roletab where roleId=#{roleId}")
    Roletab1 queryById(Long roleId);

    @Select("select * from roletab")
    List<Roletab1> getRols();

    @Select("select perId from roleper where roleId=#{rid}")
    List<Roleper1> queryByRid(Long rid);

    @Delete("delete from roleper where roleId=#{rid}")
    int delete(Long rid);

    @Insert("insert into roleper (roleId,perId) values(#{param1},#{param2})")
    int save(Long rid,Object nid);

    @Insert("INSERT INTO `traveldb`.`roletab` (`roleID`, `roleName`) VALUES (null,#{roleName})")
    int add(Roletab1 role);

    @Delete("delete from roletab where roleId=#{roleId}")
    int del(Long roleId);

    @Update("UPDATE `traveldb`.`roletab` SET `roleName`=#{roleName} WHERE `roleID`=#{roleId}")
    int update(Roletab1 r);
}
