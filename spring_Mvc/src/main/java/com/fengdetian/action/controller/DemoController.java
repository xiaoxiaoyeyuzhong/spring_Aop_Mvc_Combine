package com.fengdetian.action.controller;

import com.fengdetian.action.bean.Pojo;
import com.fengdetian.action.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.util.Arrays;
@Controller
public class DemoController {
    //自定义属性绑定
    @RequestMapping("/demo1")
    public String demo1(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        request.setAttribute("username","zhangsan");
        return "/success.jsp";
    }

    //属性参数绑定
    @RequestMapping("/demo2")
    public String demo2(String username){
        System.out.println(username);
        return "/success.jsp";
    }

    //对象参数绑定
    @RequestMapping("/demo3")
    public String demo3(User user){
        System.out.println(user);
        return "/success.jsp";
    }

    //数组参数绑定
    @RequestMapping("/demo4")
    public String demo4(Spring[] ids){
        System.out.println(Arrays.toString(ids));
        return "/success.jsp";
    }

    @RequestMapping("/demo5")            //Pojo对象参数绑定
    public String demo5(Pojo pojo){
        System.out.println(pojo.getUserList());
        return "/success.jsp";
    }

    //这里路径最后是demo7.action,还是要加.action
    @RequestMapping("/{id}/{username}/demo7")  //@PathVariable绑定restful请求
    public String demo7(@PathVariable("id") Integer id, @PathVariable("username") String username){
        System.out.println(id);
        System.out.println(username);
        return "/success.jsp";
    }

    /**
     * http://localhost:8080/springmvc01/demo8.action?name=zhangsan
     * @param username
     * @return
     */
    @RequestMapping("/demo8")            //@RequestParam强制数据类型绑定
    public String demo8(@RequestParam("name") String username) {
        System.out.println(username);
        return "/success.jsp";
    }


    //获取键为JSESSIONID的cookie值
    @RequestMapping("/demo9")
    public String getcookie(@CookieValue(value="JSESSIONID") String cookeValue){
        //输出Cookie
        System.out.println(cookeValue);
        return "/success.jsp";
    }

    @RequestMapping("/demo10")
//获取请求头host的值封装到value中
    public String demo10(@RequestHeader("host")String value){
        System.out.println(value);
        return "/success.jsp";
    }




}