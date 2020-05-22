package com.runbarry.spring.ioc.mvc.listener;

import com.runbarry.spring.ioc.mvc.bean.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

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
