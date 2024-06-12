package com.fengdetian.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopInterceptor {
    @Pointcut("execution(* com.fengdetian.service.Service*.*(..))")
    public void pt(){}

    // 前置于业务方法
    //    @Before("execution(* com.liusp.service.Service*.*(..))")     //单独定义切点
    @Before("pt()")             //引用切点
    public void somethingBefore(){
        System.out.println("前置通知中的逻辑……");
    }

    // 后置于业务方法
    @After("pt()")
    public void somethingAfterReturn(){
        System.out.println("后置通知中的逻辑……");

    }
    /**
     * 环绕通知，可以在连接点前后都做点什么事，也可以处理异常
     * @param point 环绕通知方法可拥有的参数，代表正在处理的连接点
     * @return 返回连接点应该返回的内容，或者在这里决定返回别的内容
     * @throws Throwable 可以在方法体中手工处理异常
     */
    @Around("pt()")
    public Object somethingAround(ProceedingJoinPoint point) throws Throwable{
        System.out.println("环绕通知，begin---");
        long time = System.currentTimeMillis();
        //执行连接点
        Object obj =  point.proceed();
        System.out.println("环绕通知，end---消耗时间："+(System.currentTimeMillis()-time)/1000+"秒");
        return obj;
    }
}
