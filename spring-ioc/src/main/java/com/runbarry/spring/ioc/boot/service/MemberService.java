package com.runbarry.spring.ioc.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private OrderService orderService;

    public String hello() {
        return orderService.say();
    }
}
