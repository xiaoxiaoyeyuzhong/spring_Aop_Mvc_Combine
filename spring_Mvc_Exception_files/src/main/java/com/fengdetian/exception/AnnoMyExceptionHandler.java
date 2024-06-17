package com.fengdetian.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
@ControllerAdvice           //全局异常注解
public class AnnoMyExceptionHandler {
    /**
     * @param e 触发的异常对象
     * @return
     */
    @ExceptionHandler(value = Exception.class)      //传入什么异常需要进入此方法
    public ModelAndView resolveException(Exception e) {

        ModelAndView mav=new ModelAndView();
        mav.setViewName("error");
        mav.addObject("error",e.getMessage());
        System.out.println("全局异常注解 ！！！");
        return mav;
    }
}