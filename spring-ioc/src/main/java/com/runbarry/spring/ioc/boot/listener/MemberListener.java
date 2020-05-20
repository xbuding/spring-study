package com.runbarry.spring.ioc.boot.listener;

import com.runbarry.spring.ioc.boot.bean.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

//@Service
@Slf4j
public class MemberListener implements ApplicationListener<MemberLoginEvent> {

    @Override
    public void onApplicationEvent(MemberLoginEvent event) {
        log.info("UserListener-------------------------- invoke");
        Member source = (Member) event.getSource();
        log.info("member envent {}", source.toString());
    }
}
