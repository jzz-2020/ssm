package com.zking.service.impl;

import com.zking.mapper.SsmRevenueMapper;
import com.zking.model.SsmRevenue;
import com.zking.service.ISsmRevenueService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsmRevenueServiceImpl implements ISsmRevenueService {

    @Autowired
    private SsmRevenueMapper ssmRevenueMapper;

    @Override
    public int deleteByPrimaryKey(Integer reId) {
        return ssmRevenueMapper.deleteByPrimaryKey(reId);
    }

    @Override
    public int insert(SsmRevenue record) {
        return ssmRevenueMapper.insert(record);
    }

    @Override
    public SsmRevenue selectByPrimaryKey(Integer reId) {
        return ssmRevenueMapper.selectByPrimaryKey(reId);
    }

    @Override
    public int updateByPrimaryKey(SsmRevenue record) {
        return ssmRevenueMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SsmRevenue> listAll(SsmRevenue ssmRevenue, PageBean pageBean) {
        return ssmRevenueMapper.listAll(ssmRevenue);
    }
}
