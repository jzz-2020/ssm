package com.zking.service.impl;

import com.zking.mapper.SsmCashierMapper;
import com.zking.model.SsmCashier;
import com.zking.service.ISsmCashierService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsmCashierServiceImpl implements ISsmCashierService {

    @Autowired
    private SsmCashierMapper ssmCashierMapper;

    @Override
    public int deleteByPrimaryKey(Integer caId) {
        return ssmCashierMapper.deleteByPrimaryKey(caId);
    }

    @Override
    public int insert(SsmCashier record) {
        return ssmCashierMapper.insert(record);
    }

    @Override
    public SsmCashier selectByPrimaryKey(Integer caId) {
        return ssmCashierMapper.selectByPrimaryKey(caId);
    }

    @Override
    public int updateByPrimaryKey(SsmCashier record) {
        return ssmCashierMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SsmCashier> listAll(SsmCashier ssmCashier, PageBean pageBean) {
        return ssmCashierMapper.listAll(ssmCashier);
    }
}
