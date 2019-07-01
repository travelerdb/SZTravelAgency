package com.controller.lyq;

import com.entity.lyq.Combotab1;
import com.entity.lyq.Oneselfneedtab1;
import com.service.lyq.Oneselfneedtab1Service;
import com.utils.PageList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("lyq/Oneselfneedtab")
public class Oneselfneedtab1Controller {
    @Resource
    private Oneselfneedtab1Service service;

    @RequestMapping("queryAll")
    @ResponseBody
    public PageList queryAll(Integer page,Integer rows){
        PageList p = service.queryByPage(page,rows);
        System.out.println(p);
        return p;
    }

}
