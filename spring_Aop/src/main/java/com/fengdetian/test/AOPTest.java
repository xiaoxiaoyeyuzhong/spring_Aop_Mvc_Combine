package com.fengdetian.test;

import com.fengdetian.aop.ServiceA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
    @RunWith(SpringJUnit4ClassRunner.class)
//加载spring核心配置文件
    @ContextConfiguration(value = {"classpath:applicationContext.xml"})
//加载spring核心配置类
//@ContextConfiguration(classes = {SpringConfiguration.class})
    public class AOPTest {

        @Autowired
        private ServiceA serviceA;

        @Test
        public void addAccountTest(){
            serviceA.addAccount("aop测试","测试");
        }

    }

