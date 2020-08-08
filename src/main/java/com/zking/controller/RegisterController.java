package com.zking.controller;

import com.zking.model.SsmRegister;
import com.zking.service.ISsmReigsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Register")
public class RegisterController {

    @Autowired
    private ISsmReigsterService ssmReigsterService;

    @ModelAttribute
    public void frist(Model model,SsmRegister ssmRegister){
        model.addAttribute("ssmRegister",ssmRegister);
    }


    //登记信息
    @RequestMapping("/Register")
    public String Register(SsmRegister ssmRegister){
        int insert = ssmReigsterService.insert(ssmRegister);
        if(insert>0){
            System.out.println("登记成功");
            return "1";
        }
        System.out.println("登记失败");
        return "-1";
    }

    //查看信息
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<SsmRegister> list = ssmReigsterService.findAll();
        if(null!=list){
            model.addAttribute("list",list);
            System.out.println(list);
            return "1";
        }
         return "-1";
        }


}
