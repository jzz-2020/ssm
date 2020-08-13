package com.zking.service.impl;

import com.zking.mapper.SsmRegisterMapper;
import com.zking.model.SsmRegister;
import com.zking.service.ISsmReigsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsmReigsterServiceImpl implements ISsmReigsterService {

    @Autowired
    private SsmRegisterMapper ssmRegisterMapper;

    @Override
    public int deleteByPrimaryKey(Integer rId) {
        return 0;
    }

    @Override
    public int insert(SsmRegister ssmRegister) {
        return ssmRegisterMapper.insert(ssmRegister);
    }

    @Override
    public int insertSelective(SsmRegister record) {
        return 0;
    }

    @Override
    public SsmRegister selectByPrimaryKey(Integer rId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SsmRegister record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SsmRegister record) {
        return 0;
    }

    @Override
    public List<SsmRegister> findAll() {
        return ssmRegisterMapper.findAll();
    }
}
