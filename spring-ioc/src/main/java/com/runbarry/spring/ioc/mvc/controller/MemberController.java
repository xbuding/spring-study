package com.runbarry.spring.ioc.mvc.controller;

import com.runbarry.spring.ioc.mvc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
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
