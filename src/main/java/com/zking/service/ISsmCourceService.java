package com.zking.service;

import com.zking.model.SsmCource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISsmCourceService {
    int deleteCource(Integer courceId);

    int insert(SsmCource ssmCource);

    int insertSelective(SsmCource ssmCource);

    SsmCource selectByPrimaryKey(Integer courceId);

    int updateByPrimaryKeySelective(SsmCource ssmCource);

    int updateCource(SsmCource ssmCource);

    @Transactional(readOnly = true)
    List<SsmCource> findAll();
}
