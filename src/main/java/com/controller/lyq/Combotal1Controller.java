package com.controller.lyq;

import com.entity.Orderdetailtab;
import com.entity.lyq.*;
import com.service.lyq.*;
import com.utils.PageList;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

@Controller
@RequestMapping("lyq/combotal")
public class Combotal1Controller {

    @Resource
    private Combotab1Service comboService;
    @Resource
    private Ordertab1Service orderService;
    @Resource
    private Oneselfneedtab1Service needService;
    @Resource
    private Orderdetailtab1Service detailService;
    @Resource
    private Clientab1Service clientService;

    @RequestMapping("queryAll")
    @ResponseBody
    public PageList queryAll(Integer page,Integer rows){
        return comboService.queryByPage(page,rows);
    }

    //添加私人定制套餐
    @RequestMapping("add")
    @ResponseBody
    public int add(Combotab1 combo, Ordertab1 order, Integer needId, Orderdetailtab1 detail){
        //获取登陆人的id
        Empaccount1 emp=(Empaccount1) SecurityUtils.getSubject().getPrincipal();
        combo.setOperaId(emp.getEmpId());
        combo.setOperaDate(new Date());

        int id=comboService.add(combo);

        //获取客户私人定制的需求
        Oneselfneedtab1 need = needService.queryById(needId);
        System.out.println(need);
        //生成订单
        order.setOrderDate(new Date());
        order.setClientId(need.getClientId());
        order.setComboId(id);
        order.setJoinAdult(need.getExpectAdule());//成人
        order.setJoinChildren(need.getExpectChild());//儿童
        order.setJoinCount(need.getExpectAdule()+need.getExpectChild());//总人数
        order.setPayMoney(need.getExpectPay());//应付金额   先写客户需求中的预算
        order.setOrderState(0);//待付款

        int oid=orderService.add(order);

        Clientab1 client = clientService.queryById(need.getClientId());
        System.out.println(client);
        //添加订单详情（参团人信息）
        detail.setOrderId(oid);
        detail.setClientId(client.getClientId());
        detail.setName(client.getName());
        detail.setPhone(client.getPhone());
        detail.setIdCard(client.getIdCard());
        detail.setSex(client.getSex());
        System.out.println(detail);
        detailService.add(detail);

        return 1;
    }
}
