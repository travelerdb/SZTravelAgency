package com.dao.lyq;


import com.entity.lyq.Permisstab1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PermisstabDAO{

    /*@Results({
            @Result(property="emp",column="operaId",one=@One(fetchType= FetchType.EAGER,select="com.dao.lyq.EmptabDAO.queryById"))
    })*/
    @Select("select * from permisstab where perLevel = 0")
    List<Permisstab1> queryAll();

    @Select("select * from permisstab")
    List<Permisstab1> query();

    @Select("select * from permisstab where perLevel=#{perLevel}")
    Permisstab1 queryById(long perLevel);

    @Select("select perId,perTitle,icon,url,operaDate,operaId,perLevel from permisstab" +
            " where perId in (SELECT perId FROM roleper WHERE roleId=#{rid}) and perLevel=0")
    List<Permisstab1> queryByRid(Integer rid);


    @Select("SELECT group_concat(perId) FROM roleper WHERE roleId=#{rid} group by roleId")
    String queryRids(Integer rid);

    @Select("select * from permisstab where perlevel=#{preid}")
    List<Permisstab1> queryByperLevel(Long preid);

    @Select("select permiss.* from emptab emp,empaccount account,roletab role,roleper rp,permisstab permiss " +
            "where emp.roleID=role.roleID and emp.empID=account.empID and permiss.perID=rp.perID " +
            "and role.roleID=rp.roleID and account.accNum=#{accNum}")
    List<Permisstab1> getPermissionsByUserName(String accNum);

    @Insert("INSERT INTO `traveldb`.`permisstab` (`perID`, `perTitle`, `icon`, `URL`, `perLevel`, `operaDate`, `operaID`) VALUES (null, #{perTitle}, #{icon}, #{url}, #{perLevel}, #{operaDate}, #{operaId})")
    int add(Permisstab1 p);

    @Delete("delete from permisstab where perId=#{perId}")
    int delete(Integer pid);

    @Update("UPDATE `traveldb`.`permisstab` SET `perTitle`=#{perTitle}, `icon`=#{icon}, `URL`=#{url}, `perLevel`=#{perLevel}, `operaDate`=#{operaDate}, `operaID`=#{operaId} WHERE `perID`=#{perId}")
    int update(Permisstab1 p);

    @Delete("delete from roleper where perId=#{perId}")
    int delPer(Integer pId);
}
