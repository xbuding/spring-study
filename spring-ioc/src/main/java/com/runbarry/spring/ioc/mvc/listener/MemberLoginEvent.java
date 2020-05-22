package com.runbarry.spring.ioc.mvc.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 定义事件 spring 会在{@link AbstractApplicationContext#registerListeners()}，对 ApplicationEvent 类型的事件进行初始化绑定
 * 并且 {@link org.springframework.context.support.AbstractApplicationContext#initApplicationEventMulticaster()} 进行广播
 *
 * @author Administrator
 */
public class MemberLoginEvent extends ApplicationEvent {
    public MemberLoginEvent(Object source) {
        super(source);
    }

    private static final long serialVersionUID = 1L;

}
