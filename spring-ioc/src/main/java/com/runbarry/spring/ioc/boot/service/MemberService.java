package com.runbarry.spring.ioc.boot.service;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public String hello() {
        return "hello";
    }
}
