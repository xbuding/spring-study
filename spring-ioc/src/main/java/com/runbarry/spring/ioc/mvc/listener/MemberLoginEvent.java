package com.runbarry.spring.ioc.mvc.listener;

import org.springframework.context.ApplicationEvent;

public class MemberLoginEvent extends ApplicationEvent {
    public MemberLoginEvent(Object source) {
        super(source);
    }

    private static final long serialVersionUID = 1L;

}
