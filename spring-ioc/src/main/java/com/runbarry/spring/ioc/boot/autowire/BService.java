package com.runbarry.spring.ioc.boot.autowire;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BService {
    @Autowired
    private AService bService;


    public void call() {
        log.info("B call");
    }

    public void say() {
        bService.say();
    }
}
