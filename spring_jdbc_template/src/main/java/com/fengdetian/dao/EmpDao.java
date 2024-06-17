package com.fengdetian.dao;

import com.fengdetian.bean.Emp;


public interface EmpDao {

    public void addEmp(Emp emp);
    public void removeEmp(int empNo);
    public void updateEmp(Emp emp);
    public Emp findEmp(int empNo);
}
