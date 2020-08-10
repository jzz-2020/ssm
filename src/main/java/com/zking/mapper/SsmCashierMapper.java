package com.zking.mapper;

import com.zking.model.SsmCashier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SsmCashierMapper {
    int deleteByPrimaryKey(Integer caId);

    int insert(SsmCashier record);

    SsmCashier selectByPrimaryKey(Integer caId);

    int updateByPrimaryKey(SsmCashier record);

    List<SsmCashier>  listAll(SsmCashier ssmCashier);

}