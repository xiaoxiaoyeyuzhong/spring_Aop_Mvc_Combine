package com.fengdetian.dao;

import com.fengdetian.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User findById(Integer id);

    @Insert(value = "insert  into user(username,password,address,birthday) values (#{username},#{password},#{address},#{birthday})")
    int insert(User user);
}