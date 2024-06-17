package com.fengdetian.service.impl;

import com.fengdetian.bean.Emp;
import com.fengdetian.dao.EmpDao;
import com.fengdetian.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("empService")
@Transactional(isolation = Isolation.REPEATABLE_READ)
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void removeEmp(int empNo) {
        empDao.removeEmp(empNo);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public Emp findEmp(int empNo) {
         return empDao.findEmp(empNo);
    }
}
