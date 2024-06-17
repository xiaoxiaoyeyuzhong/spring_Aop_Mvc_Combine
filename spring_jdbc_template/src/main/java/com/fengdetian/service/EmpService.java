package com.fengdetian.service;

import com.fengdetian.bean.Emp;

public interface EmpService {
    public void addEmp(Emp emp);
    public void removeEmp(int empNo);
    public void updateEmp(Emp emp);
    public Emp findEmp(int empNo);
}
