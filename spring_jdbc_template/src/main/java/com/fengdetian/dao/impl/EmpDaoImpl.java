package com.fengdetian.dao.impl;

import com.fengdetian.bean.Emp;
import com.fengdetian.bean.UserInfo;
import com.fengdetian.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository("empDao")
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void addEmp(Emp emp) {
        jdbcTemplate.update("insert into emp(ename,sal,hiredate,comm,job,mgr,deptno) values (?,?,?,?,?,?,?)",emp.geteName(),emp.getSal(),emp.getHireDate(),emp.getComm(),emp.getJob(),emp.getMgr(),emp.getDeptNo());
    }

    public void removeEmp(int empNo) {
        jdbcTemplate.update("delete from emp where empno=?",empNo);
    }

    public void updateEmp(Emp emp) {
        jdbcTemplate.update("update emp set ename=?,sal=?,hiredate=?,comm=?,job=?,mgr=?,deptno=? where empno=?",emp.geteName(),emp.getSal(),emp.getHireDate(),emp.getComm(),emp.getJob(),emp.getMgr(),emp.getDeptNo(),emp.getEmpNo());
    }

    public Emp findEmp(int empNo) {
        Emp emp = jdbcTemplate.queryForObject("select * from emp where empno=?",new BeanPropertyRowMapper<Emp>(Emp.class),1);
        return emp;
    }
}
