package com.fengdetian.dao.impl;

import com.fengdetian.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void updateAccount(String name, double money) {
        jdbcTemplate.update("insert into account(username,money) values(?,?)",name,money);
    }

    public void transfer(String name ,double money) {
        jdbcTemplate.update("update account set money=money+? where username=?",money,name);
    }
}
