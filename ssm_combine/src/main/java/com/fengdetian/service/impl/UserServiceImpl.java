package com.fengdetian.service.impl;

import com.fengdetian.bean.User;
import com.fengdetian.dao.UserMapper;
import com.fengdetian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service            //注入到ioc容器
@Transactional
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    //通过模拟异常查看事务回滚情况
    public int insertBatch(User user) {
        int result = userMapper.insert(user);
//        String str = null;//模拟异常
//        str.length();
        result += userMapper.insert(user);
        return result;
    }
}