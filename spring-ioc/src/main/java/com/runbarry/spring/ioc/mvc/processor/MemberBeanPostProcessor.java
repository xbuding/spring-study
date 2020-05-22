package com.runbarry.spring.ioc.mvc.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Administrator
 */
@Slf4j
public class MemberBeanPostProcessor implements BeanPostProcessor {


    /**
     * 会在bean的初始化方法前执行
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("postProcessBeforeInitialization..." + beanName + "=>" + bean);
        return bean;
    }

    /**
     * 会在bean的初始化方法后执行
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("postProcessAfterInitialization..." + beanName + "=>" + bean);
        return bean;
    }


}
