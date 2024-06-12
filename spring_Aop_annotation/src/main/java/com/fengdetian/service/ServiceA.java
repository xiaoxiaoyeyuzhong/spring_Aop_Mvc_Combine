package com.fengdetian.service;

import org.springframework.stereotype.Component;

@Component("serviceA")
public class ServiceA {
    public void addAccount(String account,String s){
        System.out.println("add account in ServiceA");
    }
}
