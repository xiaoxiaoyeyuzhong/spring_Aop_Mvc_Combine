package com.fengdetian.action.service;

import com.fengdetian.action.bean.User;
import com.fengdetian.action.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
//    @Autowired
//    private User user;

    @Autowired
    private HelloDao helloDao;
//    public User findUserById(int uid) {
//        user=helloDao.findUserById(uid);
//        return user;
//    }
}
