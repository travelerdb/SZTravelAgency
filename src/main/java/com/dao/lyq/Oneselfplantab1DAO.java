package com.dao.lyq;

import com.entity.lyq.Oneselfneedtab1;
import com.entity.lyq.Oneselfplantab1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Oneselfplantab1DAO {

    @Select("select plan.*,c.name,emp.empName from oneselfplantab plan left join clientab c on plan.clientID=c.clientID left join emptab emp on plan.operaID=emp.empID limit #{param1},#{param2}")
    List<Oneselfplantab1> queryByPage(Integer offset, Integer pageSize);

    @Select("select count(*) from oneselfplantab plan left join clientab c on plan.clientID=c.clientID left join emptab emp on plan.operaID=emp.empID")
    Long rowNum();

    @Insert("INSERT INTO `traveldb`.`oneselfplantab` (`planId`, `clientId`, `needId`, `routeInfo`, `wayInfo`, `trafficInfo`, `taverbInfo`, `expectPay`, `planState`, `operaId`, `operaDate`) " +
            "VALUES (null, #{clientId}, #{needId}, #{routeInfo}, #{wayInfo}, #{trafficInfo}, #{taverbInfo}, #{expectPay}, #{planState}, #{operaId}, #{operaDate})")
    int add(Oneselfplantab1 plan);

    @Update("UPDATE `traveldb`.`oneselfplantab` " +
            "SET  `clientId`=#{clientId}, `needId`=#{needId}, `routeInfo`=#{routeInfo}, `wayInfo`=#{wayInfo}," +
            " `trafficInfo`=#{trafficInfo}, `taverbInfo`=#{taverbInfo}, `expectPay`=#{expectPay}, `planState`=#{planState}, `operaId`=#{operaId}, `operaDate`=#{operaDate}" +
            " WHERE `planId`=#{planId}")
    int update(Oneselfplantab1 plan);

    @Delete("delete from oneselfplantab where planId=#{planId}")
    int delete(Integer planId);
}
