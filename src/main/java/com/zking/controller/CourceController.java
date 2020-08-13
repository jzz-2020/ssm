package com.zking.controller;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.github.pagehelper.Page;
import com.zking.model.SsmCource;
import com.zking.service.ISsmCourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Cource")
public class CourceController {

    @Autowired
    private ISsmCourceService ssmCourceService;

    @ModelAttribute
    public void frist(Model model, SsmCource ssmCource){
        model.addAttribute("ssmCource",ssmCource);
    }

    //查询课程
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<SsmCource> ls = ssmCourceService.findAll();
        if(null!=ls){
            model.addAttribute("ls",ls);
            System.out.println(ls);
            return "index";
        }
        return "error";
     }


    //删除课程
    @RequestMapping("/delete")
    public String delete(Integer courceId){
        int del = ssmCourceService.deleteCource(courceId);
        if(del>0){
            System.out.println("删除成功");
            return "1";
        }
        System.out.println("删除失败");
        return "-1";
    }

    //查询单个
    @RequestMapping("/selectbuId")
    public String selectbyId(Model model,Integer courceId){
        SsmCource cource = ssmCourceService.selectByPrimaryKey(courceId);
        if (null!=cource){
            model.addAttribute("cource",cource);
            System.out.println(cource);
            return "1";
        }
        return "-1";
    }


    //修改课程
    @RequestMapping("/update")
    public String update(SsmCource ssmCource){
        int update = ssmCourceService.updateCource(ssmCource);
        if(update>0){
            System.out.println("修改成功");
            return "1";
        }
        System.out.println("修改失败");
        return "-1";
    }
}
