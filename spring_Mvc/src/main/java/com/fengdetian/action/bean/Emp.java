package com.fengdetian.action.bean;

import java.time.LocalDateTime;

public class Emp {
    private int empNo;
    private String eName;
    private String job;

    public Emp() {

    }

    public Emp(int empNo, String eName, String job) {
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
