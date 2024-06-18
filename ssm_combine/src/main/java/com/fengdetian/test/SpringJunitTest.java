package com.fengdetian.test;
import com.fengdetian.bean.User;
import com.fengdetian.config.ContextConfig;
import com.fengdetian.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
//加载spring核心配置文件
//@ContextConfiguration(value = {"classpath:applicationContext.xml"})
//加载spring核心配置类
@ContextConfiguration(classes = {ContextConfig.class})
public class SpringJunitTest {
    @Autowired
    UserService userService;


    @Test
    public void testFindById(){
        User user = userService.findById(1);
        System.out.println(user);
    }
    @Test
    public void insertBatch(){
        User user=new User();
        user.setUsername("lili");
        user.setPassword("666");
        user.setAddress("广州");
        user.setBirthday(new Date("1999/02/18"));
        int i = userService.insertBatch(user);
        System.out.println(i);
    }

}