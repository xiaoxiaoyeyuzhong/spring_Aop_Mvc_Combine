package com.fengdetian.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserController {
    //属性参数绑定
    @RequestMapping("/login.action")
    public String login(){
        System.out.println("login.........");
        return "/success.jsp";
    }
}
