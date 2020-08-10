package com.zking.controller;

import com.sun.org.apache.xpath.internal.objects.XObject;
import com.zking.model.SsmCashier;
import com.zking.service.ISsmCashierService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Cashier")
@ResponseBody
public class SsmCashierController {
    @Autowired
    private ISsmCashierService iSsmCashierService;
    private PageBean pageBean;

    @RequestMapping("/Cashierlist")
    public Map<String,Object> Cashierlist(SsmCashier ssmCashier, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        pageBean=new PageBean();
        pageBean.setRequest(request);
        String caName = ssmCashier.getCaName();
        String caDate =ssmCashier.getCaDate();
        ssmCashier.setCaName("%"+caName+"%");
        ssmCashier.setCaDate("%"+caDate+"%");
        List<SsmCashier> ssmCashiers = iSsmCashierService.listAll(ssmCashier,pageBean);
        map.put("ssmCashiers",ssmCashiers);
        map.put("pageBean",pageBean);
        return map;
    }

    @RequestMapping("/CashierUpdate")
    public int CashierUpdate(SsmCashier ssmCashier){
       int i=iSsmCashierService.updateByPrimaryKey(ssmCashier);
       return i;
    }

    @RequestMapping("/CashierDelete")
    public  int CashierDelete(Integer caId){
        int i=iSsmCashierService.deleteByPrimaryKey(caId);
        return i;
    }

    @RequestMapping("/CashierAdd")
    public int CashierDelete(SsmCashier ssmCashier){
        int i=iSsmCashierService.insert(ssmCashier);
        return i;
    }

    @RequestMapping("/CashierSelectOne")
    public SsmCashier CashierSelectOne(Integer caId){
        SsmCashier ssmCashier = iSsmCashierService.selectByPrimaryKey(caId);
        return ssmCashier;
    }

}
