package com.fengdetian.action.controller;

import com.fengdetian.action.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
/**
 * names: 代表此类中model/modelMap的username属性将会添加到一份进入session
 * types: 此类中指定的类型会添加一份到session中
 */
@SessionAttributes(names = {"username"},types ={User.class,String.class,Integer.class} )
public class Demo2Controller {

    @RequestMapping("/demo11")
    public String demo11(Model modelMap) {
        modelMap.addAttribute("username","zhangsan");
        modelMap.addAttribute("password","admin");
        modelMap.addAttribute("age",20);
        User user=new User();
        user.setUsername("xiaodong");
        modelMap.addAttribute("user",user);
        return "/success.jsp";
    }

    /**
     * @SessionAttribute:从session中获取一个值
     * @param username
     * @param user
     * @return
     */
    @RequestMapping(value = "/demo12")
    public String demo12(@SessionAttribute("username") String username, @SessionAttribute("user") User user){
        System.out.println(username);
        System.out.println(user);
        return "/success.jsp";
    }

}