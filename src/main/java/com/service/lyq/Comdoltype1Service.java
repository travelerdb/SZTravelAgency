package com.service.lyq;

import com.dao.lyq.Comdoltype1DAO;
import com.entity.lyq.Comdoltype1;
import com.utils.PageList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Comdoltype1Service {

    @Resource
    private Comdoltype1DAO dao;

    public List<Comdoltype1> queryByTypeId(Integer typeId){
        return dao.queryByTypeId(typeId);
    }
}
