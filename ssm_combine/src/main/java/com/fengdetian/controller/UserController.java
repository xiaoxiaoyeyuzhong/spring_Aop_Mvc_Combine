package com.fengdetian.controller;

import com.fengdetian.bean.User;
import com.fengdetian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findById")
    @ResponseBody
    public User findById(Integer id){
        return userService.findById(id);
    }
}