package com.fengdetian.test;

import com.fengdetian.bean.UserInfo;
import com.fengdetian.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//加载spring核心配置文件
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //插入数据
    @Test
    public void testAdd(){
        int i=jdbcTemplate.update("insert into userinfo(uname,sex,age) values (?,?,?)", "尹森","男",18);
        System.out.println("插入成功"+ i +"条数据");
    }
    //删除
    @Test
    public void testDelete(){
        int i = jdbcTemplate.update("delete from userinfo where uid=?", 18);
        System.out.println("删除完成！+"+i);
    }

    //修改更新
    @Test
    public void testUpdate(){
        int i = jdbcTemplate.update("update userinfo set sex=? where uid=?", "女", 16);
        System.out.println("更新操作完成！"+i);
    }

    //聚合查询
    @Test
    public void testQueryCount(){
        Long count = jdbcTemplate.queryForObject("select count(*) from userinfo", Long.class);
        System.out.println("查询用户数量："+count);
    }
    //查询一个
    @Test
    public void testQueryOne(){
        UserInfo userInfo = jdbcTemplate.queryForObject("select * from userinfo where uid=?", new BeanPropertyRowMapper<UserInfo>(UserInfo.class), 16);
        System.out.println("查询一个用户数据："+userInfo);
    }
    //查询所有
    @Test
    public void testQueryAll(){
        List<UserInfo> userList = jdbcTemplate.query("select * from userinfo", new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        System.out.println("查询所有用户数据："+userList);
    }

    @Autowired
    @Qualifier("accountService")
    private AccountService accountService;
    @Test
    public void testAccounts(){
        accountService.updateAccount("fengdetian", 1000);
    }
}