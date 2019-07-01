package com.controller.lyq;

import com.entity.lyq.Roleper1;
import com.entity.lyq.Roletab1;
import com.service.lyq.Roletab1Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("lyq/role")
public class Roletab1Controller {
    @Resource
    private Roletab1Service roleService;

    @RequestMapping("queryRols")
    @ResponseBody
    public List<Roletab1> queryRols(){
        return roleService.getRols();
    }

    @RequestMapping("queryByRid")
    @ResponseBody
    public List<Roleper1> queryByRid(Roletab1 r){
        List<Roleper1> nids=roleService.queryByRid(r.getRoleId());
        return nids;
    }

    @RequestMapping("edit")
    @ResponseBody
    //修改某角色下的权限，先删除全部权限，再重新添加
    public Integer edit(Roletab1 r,String nidss){
        roleService.delete(r.getRoleId());
        nidss=nidss.substring(0, nidss.length()-1);
        String[] split = nidss.split(",");
        for(Object nid : split){
            roleService.save(r.getRoleId(), nid);
        }
        return 1;
    }

    @RequestMapping("add")
    @ResponseBody
    public Integer add(String roleName){
        Roletab1 rt=new Roletab1();
        rt.setRoleName(roleName);
        System.out.println(1234);
        roleService.add(rt);
        return 1;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Integer delete(Roletab1 r){
        //先删除该角色下的权限
        roleService.delete(r.getRoleId());
        return roleService.del(r.getRoleId());
    }

    @RequestMapping("update")
    @ResponseBody
    public Integer update(Roletab1 r){
        return roleService.update(r);
    }
}
