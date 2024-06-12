package com.fengdetian.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.fengdetian")
@EnableAspectJAutoProxy //开启aop注解支持
@EnableTransactionManagement //开启事务控制注解
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
}
