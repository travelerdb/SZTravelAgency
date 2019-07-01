package com.controller.lyq;

import com.entity.lyq.Empaccount1;
import com.entity.lyq.Oneselfplantab1;
import com.service.lyq.Oneselfplantab1Service;
import com.utils.PageList;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

@Controller
@RequestMapping("lyq/oneselfplantab")
public class Oneselfplantab1Controller {
    @Resource
    private Oneselfplantab1Service service;

    @RequestMapping("queryAll")
    @ResponseBody
    public PageList queryAll(Integer page,Integer rows){
        PageList p = service.queryByPage(page,rows);
        return p;
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(Oneselfplantab1 plan){

        //获取登陆人的id
        Empaccount1 emp=(Empaccount1)SecurityUtils.getSubject().getPrincipal();
        System.out.println(emp);
        plan.setOperaId(emp.getEmpId());
        plan.setOperaDate(new Date());

        service.add(plan);
        return 1;
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Oneselfplantab1 plan){

        plan.setPlanState(1);
        //获取登陆人的id
        Empaccount1 emp=(Empaccount1)SecurityUtils.getSubject().getPrincipal();
        plan.setOperaId(emp.getEmpId());
        plan.setOperaDate(new Date());

        service.update(plan);
        return 1;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Integer delete(Integer planId){
        service.delete(planId);
        return 1;
    }
}
