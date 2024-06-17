package com.fengdetian.service;

public interface AccountService {
    public void updateAccount(String name,double money);

    public void transfer(String fromName,String toName,double money);
}
