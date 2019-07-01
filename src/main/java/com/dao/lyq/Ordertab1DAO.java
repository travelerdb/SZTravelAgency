package com.dao.lyq;

import com.entity.lyq.Ordertab1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Ordertab1DAO {
    /*@Select("select * from ordertab limit #{param1},#{param2}")
    List<Ordertab1> queryByPage(Integer offset, Integer pageSize);*/

    /*@Select("select count(*) from ordertab")
    Long rowNum();*/

    @Select("select o.orderId,o.orderDate,o.payDate,o.clientId,o.comboId,o.issComId,o.joinAdult,o.joinChildren,o.joinCount,o.payMoney,o.orderState,client.*,c.*,i.* from ordertab o left join clientab client on o.clientID=client.clientID left join combotab c on o.comboID=c.comboID left join issuecombotab i on o.issComID=i.issComID limit #{param1},#{param2}")
    List<Map<String,Object>> queryByPage(Integer offset, Integer pageSize);

    @Select("select count(*) from ordertab o left join clientab client on o.clientID=client.clientID left join combotab c on o.comboID=c.comboID left join issuecombotab i on o.issComID=i.issComID ")
    Long rowNum();


    @Insert("INSERT INTO `traveldb`.`ordertab` (`orderDate`, `payDate`, `clientId`, `comboId`, `joinAdult`, `joinChildren`, `joinCount`, `payMoney`, `orderState`) " +
            "VALUES ( #{orderDate}, #{payDate}, #{clientId}, #{comboId}, #{joinAdult}, #{joinChildren}, #{joinCount}, #{payMoney}, #{orderState})")
    @Options(useGeneratedKeys = true, keyProperty = "orderId", keyColumn = "orderId")
    int add(Ordertab1 order);
}
