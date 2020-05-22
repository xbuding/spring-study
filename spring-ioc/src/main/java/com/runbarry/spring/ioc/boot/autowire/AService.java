package com.runbarry.spring.ioc.boot.autowire;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AService {

    @Autowired
    private BService bService;


    public void say() {
        log.info("A say");
    }

    public void invokeBServiceCall() {
        bService.call();
    }
}
