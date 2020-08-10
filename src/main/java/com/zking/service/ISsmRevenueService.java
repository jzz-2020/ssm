package com.zking.service;

import com.zking.model.SsmRevenue;
import com.zking.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISsmRevenueService {
    int deleteByPrimaryKey(Integer reId);

    int insert(SsmRevenue record);

    SsmRevenue selectByPrimaryKey(Integer reId);

    int updateByPrimaryKey(SsmRevenue record);

    @Transactional(readOnly = true)
    List<SsmRevenue> listAll(SsmRevenue ssmRevenue, PageBean pageBean);
}