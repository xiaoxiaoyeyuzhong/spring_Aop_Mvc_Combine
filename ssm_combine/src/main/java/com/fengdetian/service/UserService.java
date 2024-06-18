package com.fengdetian.service;

import com.fengdetian.bean.User;
public interface UserService {
    User findById(Integer id);
    int insertBatch(User user);
}