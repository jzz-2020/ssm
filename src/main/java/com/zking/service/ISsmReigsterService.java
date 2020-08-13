package com.zking.service;

import com.zking.model.SsmRegister;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISsmReigsterService {
    int deleteByPrimaryKey(Integer rId);

    int insert(SsmRegister ssmRegister);

    int insertSelective(SsmRegister record);

    SsmRegister selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(SsmRegister record);

    int updateByPrimaryKey(SsmRegister record);

    List<SsmRegister> findAll();
}
