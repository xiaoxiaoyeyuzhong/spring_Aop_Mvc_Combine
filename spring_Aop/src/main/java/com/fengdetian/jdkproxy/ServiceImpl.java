package com.fengdetian.jdkproxy;

/*
* //目标对象（被代理对象）
*/
public class ServiceImpl implements Service{

    public void save() {
        System.out.println("保存数据");
    }

    public void update(){
        System.out.println("更新数据");
    }

    public void delete() {
        System.out.println("删除数据");
    }
}
