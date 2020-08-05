package com.zking.service;

import com.zking.model.SsmUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISsmUserService {
    int deleteByPrimaryKey(Integer userId);

    int insert(SsmUser record);

    int insertSelective(SsmUser record);

    SsmUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SsmUser record);

    int updateByPrimaryKey(SsmUser record);

    List<SsmUser> findUserName(SsmUser ssmUser);
}
