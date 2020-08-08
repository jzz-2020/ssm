package com.zking.service.impl;

import com.zking.mapper.SsmCourceMapper;
import com.zking.model.SsmCource;
import com.zking.service.ISsmCourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SsmCourceServiceImpl implements ISsmCourceService {

    @Autowired
    private SsmCourceMapper ssmCourceMapper;

    @Override
    public int deleteCource(Integer courceId) {
        return ssmCourceMapper.deleteCource(courceId);
    }

    @Override
    public int insert(SsmCource ssmCource) {
        return ssmCourceMapper.insert(ssmCource);
    }

    @Override
    public int insertSelective(SsmCource ssmCource) {
        return 0;
    }

    @Override
    public SsmCource selectByPrimaryKey(Integer courceId) {
        return ssmCourceMapper.selectByPrimaryKey(courceId);
    }

    @Override
    public int updateByPrimaryKeySelective(SsmCource ssmCource) {
        return 0;
    }

    @Override
    public int updateCource(SsmCource ssmCource) {
        return ssmCourceMapper.updateCource(ssmCource);
    }

    @Override
    public List<SsmCource> findAll() {
        return ssmCourceMapper.findAll();
    }
}
