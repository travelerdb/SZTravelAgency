package com.controller.lyq;

import com.entity.lyq.EasyuiNood;
import com.service.lyq.TreeSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("lyq/tree")
public class TreeController {
    @Resource
    private TreeSerivce treeService;

    @RequestMapping("getTree")
    @ResponseBody
    public List<EasyuiNood> getTree() {
        List<EasyuiNood> list = treeService.getTree();
        System.out.println(list);
        return list;
    }

    @RequestMapping("getTreeByRid")
    @ResponseBody
    public List<EasyuiNood> getTreeByRid(Integer rid) {
        List<EasyuiNood> list = treeService.getTreeByRid(rid);
        System.out.println(list);
        return list;
    }

}
