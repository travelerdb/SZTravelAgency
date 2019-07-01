package com.controller.lyq.front;

import com.entity.lyq.Combotype1;
import com.service.lyq.Combotype1Service;
import com.utils.PageList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("lyq_front/combotype")
public class FrontCombotypeController {
    @Resource
    private Combotype1Service btypeService;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Combotype1> queryAll(){
        return btypeService.queryAll();
    }

    /*@RequestMapping("queryAll")
    @ResponseBody
    public PageList queryAll(Integer page, Integer rows){
        return btypeService.queryByPage(page,rows);
    }*/
}
