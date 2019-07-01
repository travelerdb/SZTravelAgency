package com.controller.lyq.front;

import com.entity.lyq.Comdoltype1;
import com.service.lyq.Comdoltype1Service;
import com.utils.PageList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("lyq_front/comdoltype")
public class FrontComdoltype1Controller {
    @Resource
    private Comdoltype1Service dtypeService;

    @RequestMapping("queryByTypeId")
    @ResponseBody
    public List<Comdoltype1> queryByTypeId(Integer typeId){
        return dtypeService.queryByTypeId(typeId);
    }

}
