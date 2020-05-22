package com.runbarry.spring;

import com.runbarry.spring.ioc.boot.async.AsyncService;
import com.runbarry.spring.ioc.boot.async.BService;
import com.runbarry.spring.ioc.boot.constructinject.AService;
import com.runbarry.spring.ioc.mvc.bean.Member;
import com.runbarry.spring.ioc.mvc.listener.MemberLoginEvent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class SpringTest {

    @Test
    public void mvcTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Member member = context.getBean(Member.class);
        log.info(member.toString());
        context.publishEvent(new MemberLoginEvent(member));
    }

    @Test
    public void constructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-constructor.xml");
        AService aService = context.getBean(AService.class);
        aService.invokeBServiceCall();
    }

    @Test
    public void autowireTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowire.xml");
        com.runbarry.spring.ioc.boot.autowire.AService aService = context.getBean(com.runbarry.spring.ioc.boot.autowire.AService.class);
        aService.invokeBServiceCall();
    }

    @Test
    public void asyncTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-async.xml");
        AsyncService asyncService = context.getBean(AsyncService.class);
        asyncService.async();
        BService bService = context.getBean(BService.class);
        bService.async();
    }
}
