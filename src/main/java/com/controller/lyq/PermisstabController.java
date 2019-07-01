package com.controller.lyq;

import com.entity.lyq.Empaccount1;
import com.entity.lyq.Permisstab1;
import com.service.lyq.PermisstabService;
import com.utils.PageList;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("lyq/permiss")
public class PermisstabController {
    @Resource
    private PermisstabService permiss;

    @RequestMapping("queryNg")
    @ResponseBody
    public PageList queryNg(){
        List<Permisstab1> list = permiss.query();
        System.out.println("-----------permiss------------");
        System.out.println(list);
        PageList p = new PageList((long) list.size(), list);
        return p;
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(Permisstab1 p){
        //获取登陆人的id
        Empaccount1 emp=(Empaccount1) SecurityUtils.getSubject().getPrincipal();
        p.setOperaId(emp.getEmpId());
        p.setOperaDate(new Date());
        System.out.println(p);

        return permiss.add(p);
    }

    @RequestMapping("delete")
    @ResponseBody
    public int delete(String pId){
        String pIds = pId.substring(0, pId.length() - 1);
        String[] perId = pIds.split(",");
        for(String s : perId){
            //先删除roleper中的数据
            permiss.delPer(Integer.parseInt(s));
            //再删除permisstab中的数据
            permiss.delete(Integer.parseInt(s));
        }
        return 1;
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Permisstab1 p){
        //获取登陆人的id
        Empaccount1 emp=(Empaccount1) SecurityUtils.getSubject().getPrincipal();
        p.setOperaId(emp.getEmpId());
        p.setOperaDate(new Date());
        System.out.println(p);

        return permiss.update(p);
    }
}
