package com.fengdetian.test;
import com.fengdetian.cglibproxy.Service;
import com.fengdetian.tools.cglibUtil;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class CGLIBTest {
    public static void main(String[] args) {
//        //返回一个service的子类
//        Service serviceProxy = (Service) Enhancer.create(Service.class, new MethodInterceptor() {
//            /*
//             *
//             *   proxy:代理对象
//             *   method:要执行的方法对象
//             *   args:要执行的方法的参数
//             *   methodProxy:代理对象的方法对象
//             * */
//            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//                System.out.println("增强的代码");
//                Object invoke = method.invoke(new Service());
//                 /*
//                methodProxy:
//                    代理对象的方法类,因为cglib代理对目标对象进行继承派生出子类,因此代理对象是目标对象的子类
//                    此代理对象方法类可以执行本代理对象方法,也可以执行
//                 */
////                Object invoke = methodProxy.invoke(new Service(), args);
//                System.out.println("增强的代码");
//                return invoke;
//            }
//        });
        Service serviceProxy = cglibUtil.createProxy(Service.class);
        serviceProxy.save();
    }
}