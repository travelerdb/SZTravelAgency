package com.service.lyq;

import com.dao.lyq.Roletab1DAO;
import com.entity.lyq.Roleper1;
import com.entity.lyq.Roletab1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Roletab1Service {
    @Resource
    private Roletab1DAO role;

    public List<Roletab1> getRolesByUserName(String accNum){
        return role.getRolesByUserName(accNum);
    }

    public List<Roletab1> getRols() {
        return role.getRols();
    }

    public List<Roleper1> queryByRid(Long rid) {
        return role.queryByRid(rid);
    }

    public int delete(Long rid){
        return role.delete(rid);
    }

    public int save(Long rid,Object nid){

        return role.save(rid, nid);
    }

    public int add(Roletab1 r){
        return role.add(r);
    }

    public int del(Long roleId){
        return role.del(roleId);
    }

    public int update(Roletab1 r){
        return role.update(r);
    }
}
