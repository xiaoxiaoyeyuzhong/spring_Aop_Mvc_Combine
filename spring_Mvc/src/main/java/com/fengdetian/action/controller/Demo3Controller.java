package com.fengdetian.action.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("request")           //代表每次请求都会创建一个新的Demo4Controller对象
//@Scope("session")               //代表每次创建session就会创建一个Demo4Controller对象
public class Demo3Controller {

    public Demo3Controller(){
        System.out.println("Demo4Controller创建啦！");
    }

    @RequestMapping("/demo13")
    public String demo13(){
        return "/success.jsp";
    }
}