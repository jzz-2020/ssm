package com.zking.mapper;

import com.zking.model.SsmRevenue;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmRevenueMapper {
    int deleteByPrimaryKey(Integer reId);

    int insert(SsmRevenue record);

    int insertSelective(SsmRevenue record);

    SsmRevenue selectByPrimaryKey(Integer reId);

    int updateByPrimaryKey(SsmRevenue record);

    List<SsmRevenue> listAll(SsmRevenue ssmRevenue);

}