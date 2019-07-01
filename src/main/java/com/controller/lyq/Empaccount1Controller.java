package com.controller.lyq;

import com.entity.lyq.Empaccount1;
import com.service.lyq.Empaccount1Service;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@EnableSwagger2
@RestController
@RequestMapping("lyq/empaccount")
public class Empaccount1Controller {
    @Resource
    private Empaccount1Service empaccount;

    @RequestMapping("tologin")
    public ModelAndView toLogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/login");
        return mv;
    }

    @RequestMapping("main")
    public ModelAndView main(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/home");
        return mv;
    }

    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/home");
        return mv;
    }

    @PostMapping("login")
    public Map<String, Object>  login(Empaccount1 emp, BindingResult bindingResult, HttpSession session){
        System.out.println("------------login-------------------");
        Map<String, Object> map = new HashMap<String, Object>();

        // 1、JSR303
        if (bindingResult.hasErrors()) {
            map.put("success", false);
            map.put("errorInfo", bindingResult.getFieldError().getDefaultMessage());
            return map;
        }

        // 2、Shiro
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(emp.getAccNum(), emp.getPassword());
        try {
            //当调用subject的登入方法时，会跳转到认证的方法上。。。。。。。。。。
            subject.login(token);
            Empaccount1 e=(Empaccount1) SecurityUtils.getSubject().getPrincipal();
            session.setAttribute("emp",e);

            map.put("success", true);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
            map.put("errorInfo", "用户名或者密码错误!");
            return map;
        }
    }

    @RequiresPermissions({"添加"}) //没有的话 AuthorizationException
    @RequestMapping("/select")
    public Map<String, Object> selectPermission() {
        System.out.println("select");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", true);
        map.put("msg", "当前角色有查看的权力");
        return map;
    }

    @RequiresPermissions({"权限查询"}) //没有的话 AuthorizationException
    @RequestMapping("selectPer")
    public ModelAndView selectPer() {
        ModelAndView mv = new ModelAndView();
        System.out.println("admin/lyq/permisstab");
        mv.setViewName("admin/lyq/permisstab");
        return mv;
    }

    @RequiresPermissions({"套餐查询"}) //没有的话 AuthorizationException
    @RequestMapping("selectCombo")
    public ModelAndView selectCombo() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/combotab");
        return mv;
    }

    @RequiresPermissions({"定制需求"}) //没有的话 AuthorizationException
    @RequestMapping("selectNeed")
    public ModelAndView selectNeed() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/oneselfneed");
        return mv;
    }

    @RequiresPermissions({"定制方案"}) //没有的话 AuthorizationException
    @RequestMapping("selectPlan")
    public ModelAndView selectPlan() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/oneselfplan");
        return mv;
    }

    @RequiresPermissions({"查看角色"}) //没有的话 AuthorizationException
    @RequestMapping("selectRole")
    public ModelAndView selectRole() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/rols");
        return mv;
    }

    @RequiresPermissions({"订单查询"}) //没有的话 AuthorizationException
    @RequestMapping("selectOrder")
    public ModelAndView selectOrder() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/lyq/ordertab");
        return mv;
    }
}
