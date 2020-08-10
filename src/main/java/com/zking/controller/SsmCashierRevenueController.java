package com.zking.controller;

import com.zking.model.SsmRevenueCashier;
import com.zking.service.ISsmRevenueCashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Class")
@ResponseBody
public class SsmCashierRevenueController {

    @Autowired
    private ISsmRevenueCashierService iSsmRevenueCashierService;

    @RequestMapping("/Classlist")
    public List<SsmRevenueCashier> CashierRevenuelist(SsmRevenueCashier ssmRevenueCashier){
        List<SsmRevenueCashier> ssmRevenueCashiers = iSsmRevenueCashierService.listAllPid(ssmRevenueCashier);
        return ssmRevenueCashiers;
    }


    @RequestMapping("/ClassSelectOne")
    public  SsmRevenueCashier ClassSelect(Integer classId){
        SsmRevenueCashier ssmRevenueCashier = iSsmRevenueCashierService.selectByPrimaryKey(classId);
        return ssmRevenueCashier;
    }

    @RequestMapping("/ClassAdd")
    public int ClassAdd(SsmRevenueCashier ssmRevenueCashier){
        int insert = iSsmRevenueCashierService.insert(ssmRevenueCashier);
        return insert;
    }

    @RequestMapping("/ClassUpdate")
    public int ClassUpdate(SsmRevenueCashier ssmRevenueCashier){
        int i = iSsmRevenueCashierService.updateByPrimaryKey(ssmRevenueCashier);
        return i;
    }

    @RequestMapping("/ClassDelete")
    public int ClassDelete(Integer classId){
        int i = iSsmRevenueCashierService.deleteByPrimaryKey(classId);
        return i;
    }

}
