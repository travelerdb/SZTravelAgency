package com.controller.lyq.front;

import com.entity.lyq.Combotab1;
import com.service.lyq.Combotab1Service;
import com.utils.PageList;
import com.utils.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("lyq_front/combotab")
public class FrontCombotabController {
    @Resource
    private Combotab1Service combotab1Service;

    @RequestMapping("queryByDolId")
    @ResponseBody
    public List<Combotab1> queryByDolId(Integer dolId){
        return combotab1Service.queryByDolId(dolId);
    }

    @RequestMapping("queryByDolIdByPage")
    @ResponseBody
    public PageUtil<Combotab1> queryByDolIdByPage(Integer dolId, Integer pageNum, Integer pageSize){
        PageUtil<Combotab1> p=combotab1Service.queryByDolIdByPage(dolId,pageNum,pageSize);
        System.out.println(p);
        return p;
    }
}
