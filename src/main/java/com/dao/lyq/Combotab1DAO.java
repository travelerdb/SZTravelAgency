package com.dao.lyq;

import com.entity.lyq.Combotab1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Combotab1DAO {

    @Select("select c.*,e.empName,type.dolName from combotab c left join emptab e on c.operaID=e.empID left join comdoltype type on c.dolID=type.dolID limit #{param1},#{param2}")
    /*@Results({
            @Result(property = "operaId", column = "operaId"),
            @Result(property = "emp", column = "operaId",one = @One(select =
                    "com.dao.lyq.EmptabDAO.queryById"))
    })*/
    List<Combotab1> queryByPage(Integer offset, Integer pageSize);

    @Select("select * from combotab where dolId=#{dolId} and comboState=1")
    List<Combotab1> queryByDolId(Integer dolId);

    //前台三级套餐分页
    @Select("select * from combotab where dolId=#{param1} and comboState=1 limit #{param2},#{param3}")
    List<Combotab1> queryByDolIdByPage(Integer dolId,Integer offSet,Integer pageSize);

    //获取总行数
    @Select("select count(*) from combotab where dolId=#{param1}")
    Long getCounts(Integer dolId);

    @Select("select count(*) from combotab c left join emptab e on c.operaID=e.empID left join comdoltype type on c.dolID=type.dolID")
    /*@Results({
            @Result(property = "operaId", column = "operaId"),
            @Result(property = "emp", column = "operaId",many = @Many(select =
                    "com.dao.lyq.EmptabDAO.queryById"))
    })*/
    Long rowNum();

    @Insert("INSERT INTO `traveldb`.`combotab` ( `title`, `route`, `enlistAfterDay`, `adultPrice`, `childPrice`, `allowance`, `beginCity`, `countDay`, `vehicle`, `includeInfo`, `uncludeInfo`, `paymentInfo`, `payAttenInfo`, `visaInfo`, `operaDate`, `operaID`, `comboState`, `comboImage`) " +
            "VALUES ( #{title}, #{route}, #{enlistAfterDay}, #{adultPrice}, #{childPrice}, #{allowance}, #{beginCity}, #{countDay}, #{vehicle}, #{includeInfo}, #{uncludeInfo}, #{paymentInfo}, #{payAttenInfo}, #{visaInfo}, #{operaDate}, #{operaId}, #{comboState}, #{comboImage})")
    @Options(useGeneratedKeys = true, keyProperty = "comboId", keyColumn = "comboId")
    int add(Combotab1 combo);
}
