package com.fengdetian.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
@Configuration
@ComponentScan("com.fengdetian")
@EnableAspectJAutoProxy //开启aop注解支持
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {
}
