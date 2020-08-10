package com.zking.service;

import com.zking.model.SsmCashier;
import com.zking.util.PageBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
/**
 *
 */
public interface ISsmCashierService {
    int deleteByPrimaryKey(Integer caId);

    int insert(SsmCashier record);

    SsmCashier selectByPrimaryKey(Integer caId);

    int updateByPrimaryKey(SsmCashier record);

    @Transactional(readOnly = true)
    List<SsmCashier> listAll(SsmCashier ssmCashier, PageBean pageBean);

}