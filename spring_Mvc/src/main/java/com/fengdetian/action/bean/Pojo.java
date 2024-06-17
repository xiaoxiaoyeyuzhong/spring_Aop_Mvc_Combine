package com.fengdetian.action.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
public class Pojo {
    private String[] ids;
    private User user;
    private List<User> userList;
    private Map<String ,String> map;

    @Override
    public String toString() {
        return "Pojo{" +
                "ids=" + Arrays.toString(ids) +
                ", user=" + user +
                ", userList=" + userList +
                ", map=" + map +
                '}';
    }

    public String[] getIds() {
        return ids;
    }

    public User getUser() {
        return user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
