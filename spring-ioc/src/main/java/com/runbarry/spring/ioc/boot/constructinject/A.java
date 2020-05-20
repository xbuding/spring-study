package com.runbarry.spring.ioc.boot.constructinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class A {

    private B b;

    public A(B b) {
        this.b = b;
    }

    public void say() {
        log.info("A say");
    }

    public void invokeBCall() {
        b.call();
    }
}
