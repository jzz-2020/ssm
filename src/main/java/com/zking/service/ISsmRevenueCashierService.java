package com.zking.service;

import com.zking.model.SsmRevenueCashier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISsmRevenueCashierService {
    int deleteByPrimaryKey(Integer classId);

    int insert(SsmRevenueCashier record);

    SsmRevenueCashier selectByPrimaryKey(Integer classId);

    int updateByPrimaryKey(SsmRevenueCashier record);

    List<SsmRevenueCashier> listAllPid(SsmRevenueCashier ssmRevenueCashier);
}