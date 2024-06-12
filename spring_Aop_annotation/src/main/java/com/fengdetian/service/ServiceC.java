package com.fengdetian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
@Component("serviceC")
@Transactional
public class ServiceC {
    /**
     * 不必嵌入事务管理的代码
     * @throws SQLException
     * @throws Exception
     */
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void addUser() throws SQLException {
        System.out.println("withdraw in ServiceC");
        Connection conn = dataSource.getConnection();//一定要以这种方式获取连接
        Statement stmt = conn.createStatement();
        //可以添加成功是应为事务通知帮我们提交了事务
        stmt.execute("INSERT  INTO userinfo(uname,sex,age) VALUES ('尹森','男',999)");
        System.out.println("事务提交");
        //默认情况下Spring只会为未捕获的运行时异常回滚事务
//        throw new RuntimeException("发生异常");
    }
    @Autowired
    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
