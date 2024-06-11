package com.fengdetian.aop;

import org.springframework.jdbc.datasource.DataSourceUtils;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class ServiceC {
    /**
     * 不必嵌入事务管理的代码
     * @throws SQLException
     * @throws Exception
     */
    public void addUser() throws SQLException {
        System.out.println("withdraw in ServiceC");
        Connection conn = DataSourceUtils.getConnection(dataSource);//一定要以这种方式获取连接
        Statement stmt = conn.createStatement();
        //可以添加成功是应为事务通知帮我们提交了事务
        stmt.execute("INSERT  INTO userinfo(uname,sex,age) VALUES ('小王','男',19)");
        System.out.println("事务提交");
        //默认情况下Spring只会为未捕获的运行时异常回滚事务
//        throw new RuntimeException("some exception");
    }
    private DataSource dataSource;
    // @Resource
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
