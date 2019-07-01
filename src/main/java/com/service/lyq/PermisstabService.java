package com.service.lyq;

import com.dao.lyq.PermisstabDAO;
import com.entity.lyq.Permisstab1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PermisstabService {
    @Resource
    private PermisstabDAO permiss;

    public List<Permisstab1> query(){
        return permiss.query();
    }

    public List<Permisstab1> getPermissionsByUserName(String accNum){
        return permiss.getPermissionsByUserName(accNum);
    }

    public int add(Permisstab1 p){
        return permiss.add(p);
    }

    public int delete(Integer pid){
        return permiss.delete(pid);
    }

    public int update(Permisstab1 p){
        return  permiss.update(p);
    }

    public int delPer(Integer pId){
        return permiss.delPer(pId);
    }
}
