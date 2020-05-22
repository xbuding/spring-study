package com.runbarry.spring.ioc.mvc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private MemberService memberService;


    public String say() {
        log.info("I am orderService");
        return "orderService";
    }
}
