package com.runbarry.spring.ioc.boot.constructinject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AService {

    private BService bService;

    public AService(BService bService) {
        this.bService = bService;
    }

    public void say() {
        log.info("A say");
    }

    public void invokeBServiceCall() {
        bService.call();
    }
}
