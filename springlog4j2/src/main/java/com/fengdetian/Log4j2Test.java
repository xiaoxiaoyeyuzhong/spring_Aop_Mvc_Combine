package com.fengdetian;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Test {
    private static final Logger log = LoggerFactory.getLogger(Log4j2Test.class);

    public static void main(String[] args){
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
