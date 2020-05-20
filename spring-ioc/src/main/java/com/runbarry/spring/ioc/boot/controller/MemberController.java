package com.runbarry.spring.ioc.boot.controller;

import com.runbarry.spring.ioc.boot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return memberService.hello();
    }
}
