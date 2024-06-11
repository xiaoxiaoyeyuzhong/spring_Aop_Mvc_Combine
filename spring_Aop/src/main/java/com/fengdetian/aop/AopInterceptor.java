package com.fengdetian.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopInterceptor {
    // 前置于业务方法
    public void somethingBefore(){
        System.out.println("前置通知中的逻辑……");
    }

    // 后置于业务方法
    public void somethingAfterReturn(){
        System.out.println("后置通知中的逻辑……");
    }

    /**
     * 环绕通知，可以在连接点前后都做点什么事，也可以处理异常
     * @param point 环绕通知方法可拥有的参数，代表正在处理的连接点
     * @return 返回连接点应该返回的内容，或者在这里决定返回别的内容
     * @throws Throwable 可以在方法体中手工处理异常
     */
    public Object somethingAround(ProceedingJoinPoint point) throws Throwable{
        System.out.println("环绕通知，begin---");
        long time = System.currentTimeMillis();
        //执行连接点
        Object obj =  point.proceed();
        System.out.println("环绕通知，end---消耗时间："+(System.currentTimeMillis()-time)/1000+"秒");
        return obj;
    }

    public Object transactionHandle(ProceedingJoinPoint point) throws Throwable {
        try {
            /*开启事务*/
            System.out.println("开启事务！！！！");
            //执行连接点

            Object obj =  point.proceed();

            /*提交事务*/
            System.out.println("提交事务！！！！");
            return obj;
        } catch (Throwable e) {
            /*回滚事务*/
            System.out.println("事务回滚");
            throw e;
        }finally{
            System.out.println("关闭资源！！！");
            //关闭连接，或做一些其他事
        }
    }
}
