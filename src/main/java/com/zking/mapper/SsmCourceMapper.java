package com.zking.mapper;

import com.zking.model.SsmCource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmCourceMapper {
    int deleteCource(Integer courceId);

    int insert(SsmCource ssmCource);

    int insertSelective(SsmCource ssmCource);

    SsmCource selectByPrimaryKey(Integer courceId);

    int updateByPrimaryKeySelective(SsmCource ssmCource);

    int updateCource(SsmCource ssmCource);

    List<SsmCource> findAll();
}