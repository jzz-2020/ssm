package com.zking.mapper;

import com.zking.model.SsmUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SsmUser ssmUser);

    int insertSelective(SsmUser record);

    SsmUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SsmUser record);

    int updateByPrimaryKey(SsmUser record);

    List<SsmUser> findUser(SsmUser ssmUser);
}