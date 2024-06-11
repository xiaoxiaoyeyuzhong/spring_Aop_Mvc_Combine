package com.fengdetian.test;

import com.fengdetian.jdkproxy.Service;
import com.fengdetian.jdkproxy.ServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
        /*
        最终返回一个代理对象,此代理对象对目标对象的所有方法都进行了代理
        最终执行代理对象的任何方法都会执行InvocationHandler中的invoke方法
         */
        Service o = (Service) Proxy.newProxyInstance(
                /*
               传入目标对象的类加载器
                 */
                ServiceImpl.class.getClassLoader(),
                /*
             传入目标对象的所有实现接口的字节码对象
             代理对象就是根据此接口字节码对象来指定代理方法,实现动态方法代理
               要不然目标对象增加一个方法,动态代理需要手动添加一个代理方法
                 */
                ServiceImpl.class.getInterfaces(),
                new InvocationHandler() {

                    //proxy是代理对象
                    //method是目标对象的方法
                    //args是目标对象方法的参数
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("增强的代码1，在调用原来serviceImpl代码前执行");
                        /*
                        因为method.invoke执行的是目标对象的具体方法,因此必须传入目标对象
                         */
                        Object invoke = method.invoke(new ServiceImpl());
                        System.out.println("增强的代码2，在调用原来serviceImpl代码后执行");
                        return invoke;
                    }
                }
        );
        //代理对象执行save方法,最终会执行InvocationHandler中的invoke方法
        o.save();
        o.delete();
        //这种方式的适用范围是所有的方法都要进行代码增强，且实现了接口的情况。

    }
}
