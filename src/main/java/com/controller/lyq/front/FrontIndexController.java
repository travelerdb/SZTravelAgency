package com.controller.lyq.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("lyq_front/index")
public class FrontIndexController {

    @RequestMapping("t1")
    public ModelAndView t1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("front/lyq/srdz");
        return mv;
    }
}
