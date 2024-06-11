package com.fengdetian.tools;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class cglibUtil {

    @SuppressWarnings("unchecked")
    public static <T> T createProxy(final Class<T> clazz) {
        return (T) Enhancer.create(clazz, new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("增强的代码");
                T targetInstance = clazz.getDeclaredConstructor().newInstance();
                Object result = method.invoke(targetInstance, args);
                /*
                methodProxy:
                    代理对象的方法类,因为cglib代理对目标对象进行继承派生出子类,因此代理对象是目标对象的子类
                    此代理对象方法类可以执行本代理对象方法,也可以执行
                 */
                // Object result = methodProxy.invoke(targetInstance, args);
                System.out.println("增强的代码");
                return result;
            }
        });
    }
}
