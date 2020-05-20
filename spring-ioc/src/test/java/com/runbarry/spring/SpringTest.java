package com.runbarry.spring;

import com.runbarry.spring.ioc.boot.bean.Member;
import com.runbarry.spring.ioc.boot.constructinject.A;
import com.runbarry.spring.ioc.boot.listener.MemberLoginEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringTest {

    //https://cloud.tencent.com/developer/article/1497689
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Member member = context.getBean(Member.class);
        log.info(member.toString());
        context.publishEvent(new MemberLoginEvent(member));


        log.info("----------------");


        A a = context.getBean(A.class);
        a.invokeBCall();
    }
}
