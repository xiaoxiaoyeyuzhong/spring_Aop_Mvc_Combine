package com.fengdetian.exception;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 全局异常处理类
 */
public class MyExceptionHandler implements HandlerExceptionResolver {
    /**
     *
     * @param request
     * @param response
     * @param obj   :出现异常handler(HandlerMethod类型)
     * @param e     :出现的异常对象
     * @return
     */

    public ModelAndView resolveException(
            HttpServletRequest request,
            HttpServletResponse response,
            Object obj,
            Exception e) {

        HandlerMethod method= (HandlerMethod) obj;
        ModelAndView mav=new ModelAndView();
        mav.setViewName("/error.jsp");
        mav.addObject("error",e.getMessage());
        System.out.println("全局异常处理类!!");
        return mav;
    }
}