package com.fengdetian.test;

import com.fengdetian.aop.ServiceA;
import com.fengdetian.aop.ServiceC;
import com.fengdetian.service.serviceC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//加载spring核心配置文件
    @ContextConfiguration(value = {"classpath:applicationContext.xml"})
//加载spring核心配置类
//@ContextConfiguration(classes = {SpringConfiguration.class})
    public class AOPTest {

        @Autowired
        private ServiceA serviceA;

        @Autowired
        private ServiceC serviceC;

        @Test
        public void addAccountTest(){
            serviceA.addAccount("aop测试","测试");
        }

        @Test
        public void addUserTest() throws SQLException {
            serviceC.addUser();
        }

    }

