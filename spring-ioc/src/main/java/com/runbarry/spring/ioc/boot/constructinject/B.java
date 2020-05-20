package com.runbarry.spring.ioc.boot.constructinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class B {

    private A a;

    public B(A a) {
        this.a = a;
    }

    public void call() {
        log.info("B call");
    }

    public void say() {
        a.say();
    }
}
