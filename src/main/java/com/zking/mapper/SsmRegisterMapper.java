package com.zking.mapper;

import com.zking.model.SsmRegister;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmRegisterMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(SsmRegister ssmRegister);

    int insertSelective(SsmRegister record);

    SsmRegister selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(SsmRegister record);

    int updateByPrimaryKey(SsmRegister record);

    List<SsmRegister> findAll();
}