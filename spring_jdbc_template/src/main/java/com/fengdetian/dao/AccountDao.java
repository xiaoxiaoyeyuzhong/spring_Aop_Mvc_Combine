package com.fengdetian.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public interface AccountDao {
    public void  updateAccount(String name,double money );
}
