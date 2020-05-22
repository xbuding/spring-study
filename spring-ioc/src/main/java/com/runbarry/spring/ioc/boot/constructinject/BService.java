package com.runbarry.spring.ioc.boot.constructinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BService {

    private AService bService;

    public BService(AService bService) {
        this.bService = bService;
    }

    public void call() {
        log.info("B call");
    }

    public void say() {
        bService.say();
    }
}
