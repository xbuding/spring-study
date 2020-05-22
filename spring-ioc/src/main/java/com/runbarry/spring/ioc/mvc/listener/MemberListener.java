package com.runbarry.spring.ioc.mvc.listener;

import com.runbarry.spring.ioc.mvc.bean.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 事件监听 观察者模式
 */
@Service
@Slf4j
public class MemberListener implements ApplicationListener<MemberLoginEvent> {

    @Override
    public void onApplicationEvent(MemberLoginEvent event) {
        log.info("MemberListener-------------------------- invoke");
        Member source = (Member) event.getSource();
        log.info("member event {}", source.toString());
    }
}
