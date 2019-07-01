package com.controller.lyq;

import com.service.lyq.Ordertab1Service;
import com.utils.PageList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("lyq/ordertab")
public class Ordertab1Controller {
    @Resource
    private Ordertab1Service service;

    @RequestMapping("queryAll")
    @ResponseBody
    public PageList queryAll(Integer page, Integer rows){
        return service.queryByPage(page, rows);
    }

}
