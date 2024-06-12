package com.fengdetian.bean;

public class Account {
    private String username;
    private double money;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
