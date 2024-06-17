package com.fengdetian.controller;
import com.fengdetian.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RestController
public class UserController {
    //属性参数绑定
    @RequestMapping("/login")
    public String login(){
        System.out.println("login.........");
        return "success";
    }

    @RequestMapping("/json1")
    public String json1(@RequestBody User user) {           //json字符串 转user
        System.out.println(user);
        return "/success.jsp";
    }

    //json字符串 转map  Map类型不支持json对象
    @RequestMapping("/json2")
    public String json2(@RequestBody Map map) {
        System.out.println(map);
        return "/success.jsp";
    }

    @RequestMapping("/json3")
//表示对象以json对象写出到前端 并修改contentType:'application/json;charset=utf8'
    @ResponseBody
    public User json3() {         //user转json对象
        User user = new User();
        user.setUsername("xiaobiao");
        user.setPassword("admin");
        user.setAddress("guangzhou");
        return user;
    }

    //规定前端提交的请求头必须application/json;charset=utf8
    @RequestMapping(value = "/json6", consumes = "application/json;charset=utf8")
    @ResponseBody
    public User json6(@RequestBody User user) {
        return user;
    }
}