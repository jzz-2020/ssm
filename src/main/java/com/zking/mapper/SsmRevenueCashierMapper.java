package com.zking.mapper;

import com.zking.model.SsmRevenueCashier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmRevenueCashierMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(SsmRevenueCashier record);

    SsmRevenueCashier selectByPrimaryKey(Integer classId);

    int updateByPrimaryKey(SsmRevenueCashier record);

    List<SsmRevenueCashier> listAllPid(SsmRevenueCashier ssmRevenueCashier);

}