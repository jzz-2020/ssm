package com.zking.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zking.model.SsmUser;
import com.zking.service.ISsmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/SsmUser")
public class SsmUserController {



    //自动找到接口
    @Autowired
    private ISsmUserService SsmUserService;



    //非请求方法，在请求方法前运行
//    @ModelAttribute
//    public void toHello(Model model, HttpServletRequest request){

//    }



    /**
     * 根据id查询单个对象·接口
     * @param    userId
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectUserByID", method = RequestMethod.POST)
    @ResponseBody
    public String selectUserByID(String userId, Model model){


        System.out.println("Controller：SsmUser-- selectUserByID类   :调用");
        SsmUser ssmUser = SsmUserService.selectByPrimaryKey(Integer.parseInt(userId));

        String json ="";

        try {

            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(ssmUser);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(json);

        return json;
    };



    /**
     * 查询所有
     * @param model
     * @return
     */
    @ResponseBody
//    @RequestMapping(value = "/selectUserAll",method = RequestMethod.POST)
     @RequestMapping(value = "/selectUserAll",produces = {"application/json;charset=UTF-8"})  //可用
    public String selectUserAll(Model model){

        System.out.println("Controller：SsmUser-- selectUserAll类   :调用");
        List<SsmUser> ssmUserList = SsmUserService.selectSsmUserAll();

        String json ="";

        try {

            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(ssmUserList);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(json);

        return json;
    };







}
