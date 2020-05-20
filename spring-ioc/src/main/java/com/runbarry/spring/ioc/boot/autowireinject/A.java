package com.runbarry.spring.ioc.boot.autowireinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class A {

    @Autowired
    private B b;


    public void say() {
        log.info("A say");
    }

    public void invokeBCall() {
        b.call();
    }
}
