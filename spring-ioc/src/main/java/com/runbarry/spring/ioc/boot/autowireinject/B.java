package com.runbarry.spring.ioc.boot.autowireinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class B {

    @Autowired
    private A a;


    public void call() {
        log.info("B call");
    }

    public void say() {
        a.say();
    }
}
