package com.runbarry.spring;

import com.runbarry.spring.ioc.boot.bean.Member;
import com.runbarry.spring.ioc.boot.listener.MemberLoginEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Member member = context.getBean(Member.class);
        System.err.println(member);
        context.publishEvent(new MemberLoginEvent(member));
    }
}
