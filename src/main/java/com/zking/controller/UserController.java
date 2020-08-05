package com.zking.controller;

import com.zking.model.SsmUser;
import com.zking.service.ISsmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private ISsmUserService ssmUserService;

    //登录方法
    @RequestMapping("/username")
    public String findUser(SsmUser ssmUser, Model model){
        List<SsmUser> user = ssmUserService.findUserName(ssmUser);
        System.out.println(user);
        if(null!=user){
            model.addAttribute("user",user);
            return  "1";
        }
        return  "-1";
    }

    @ModelAttribute
    public void frist(Model model,SsmUser ssmUser){
        model.addAttribute("ssmUser",ssmUser);
    }

    //跳转注册页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addUser";
    }

    //注册方法
    @RequestMapping("/AddUser")
        public String AddUser(Model model,SsmUser ssmUser){
            ssmUserService.insert(ssmUser);
            return "redirect:1";
    }

}
