package com.zking.service.impl;

import com.zking.mapper.SsmUserMapper;
import com.zking.model.SsmUser;
import com.zking.service.ISsmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsmUserServiceImpl implements ISsmUserService {

    @Autowired
    private SsmUserMapper ssmUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return 0;
    }

    @Override
    public int insert(SsmUser ssmUser) {
        return ssmUserMapper.insert(ssmUser);
    }

    @Override
    public int insertSelective(SsmUser record) {
        return 0;
    }

    @Override
    public SsmUser selectByPrimaryKey(Integer userId) {
        return ssmUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(SsmUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SsmUser record) {
        return 0;
    }

    @Override
    public List<SsmUser> findUserName(SsmUser ssmUser) {
        return ssmUserMapper.findUser(ssmUser);
    }


}
