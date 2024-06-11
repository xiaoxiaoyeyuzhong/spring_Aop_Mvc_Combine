package com.fengdetian.test;
import com.fengdetian.service.serviceA;
import com.fengdetian.service.serviceC;
import org.junit.Test;

public class test_Aop {
    @Test
    public void test()
    {
        serviceC c = new serviceC();
        c.show();
    }

}
