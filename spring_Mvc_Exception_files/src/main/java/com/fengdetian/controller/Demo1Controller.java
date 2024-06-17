package com.fengdetian.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo1Controller {

    @RequestMapping("/test1.action")
//    @ResponseBody
    public String test1() {
        System.out.println("test1 方法开始。。。");
        int i = 1 / 0;
        System.out.println("test1 执行算法。。。");

        return "/success.jsp";
    }

    /**
     * 当前controller方法出现异常进入此方法
     * @param model
     * @param e:出现的异常对象
     * @return
     */
//    @ExceptionHandler(ArithmeticException.class)
//    public String test2(Model model, Exception e) {
//
//        model.addAttribute("error", e.getMessage());
//        System.out.println("出现异常啦！");
//
//        return "/error.jsp";
//    }
}