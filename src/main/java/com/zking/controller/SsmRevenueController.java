package com.zking.controller;

import com.zking.model.SsmRevenue;
import com.zking.service.ISsmRevenueService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Revenue")
@ResponseBody
public class SsmRevenueController {

    @Autowired
    private ISsmRevenueService iSsmRevenueService;
    private PageBean pageBean;

    @RequestMapping("/revenueList")
    public Map<String,Object> revenueList(SsmRevenue ssmRevenue, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        pageBean=new PageBean();
        pageBean.setRequest(request);
        List<SsmRevenue> ssmRevenues = iSsmRevenueService.listAll(ssmRevenue,pageBean);
        map.put("pageBean",pageBean);
        map.put("ssmRevenues",ssmRevenues);
        return map;
    }

    @RequestMapping("/revenueUpdate")
    public int revenueUpdate(SsmRevenue ssmRevenue){
        int i = iSsmRevenueService.updateByPrimaryKey(ssmRevenue);
        return i;
    }

    @RequestMapping("/revenueAdd")
    public int revenueAdd(SsmRevenue ssmRevenue){
        int i=iSsmRevenueService.insert(ssmRevenue);
        return i;
    }

    @RequestMapping("/revenueDelete")
    public  int revenueDelete(Integer ssmRevenue){
        int i=iSsmRevenueService.deleteByPrimaryKey(ssmRevenue);
        return i;
    }

}
