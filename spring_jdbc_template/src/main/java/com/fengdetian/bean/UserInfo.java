package com.fengdetian.bean;

public class UserInfo {
    private int uid;
    private String uname;
    private String sex;
    private int age;

    public UserInfo() {
    }

    public UserInfo(int uid, String uname, String sex, int age) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.age = age;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}