package com.controller.lyq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("t1")
    public ModelAndView t1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("front/lyq/index");
        return mv;
    }
}
