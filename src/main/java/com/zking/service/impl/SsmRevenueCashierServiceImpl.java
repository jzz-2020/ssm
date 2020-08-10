package com.zking.service.impl;

import com.zking.mapper.SsmRevenueCashierMapper;
import com.zking.model.SsmRevenueCashier;
import com.zking.service.ISsmRevenueCashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsmRevenueCashierServiceImpl implements ISsmRevenueCashierService {

    @Autowired
    private SsmRevenueCashierMapper ssmRevenueCashierMapper;

    @Override
    public int deleteByPrimaryKey(Integer classId) {
        return ssmRevenueCashierMapper.deleteByPrimaryKey(classId);
    }
    @Override
    public int insert(SsmRevenueCashier record) {
        return ssmRevenueCashierMapper.insert(record);
    }

    @Override
    public SsmRevenueCashier selectByPrimaryKey(Integer classId) {
        return ssmRevenueCashierMapper.selectByPrimaryKey(classId);
    }

    @Override
    public int updateByPrimaryKey(SsmRevenueCashier record) {
        return ssmRevenueCashierMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SsmRevenueCashier> listAllPid(SsmRevenueCashier ssmRevenueCashier) {
        return ssmRevenueCashierMapper.listAllPid(ssmRevenueCashier);
    }
}
