package com.runbarry.spring.ioc.mvc.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * BeanFactoryPostProcessor会在BeanPostProcessor之前执行，可以拓展BeanDefinition等操作
 * MemberBeanFactoryPostProcessor会在 {@link MemberBeanPostProcessor}之前，执行
 *
 * @author Administrator
 */
@Slf4j
public class MemberBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("调用 MemberBeanFactoryPostProcessor");
        BeanDefinition bd = beanFactory.getBeanDefinition("member");
        MutablePropertyValues pv = bd.getPropertyValues();
        if (pv.contains("remark")) {
            pv.addPropertyValue("remark", "在BeanFactoryPostProcessor中修改之后的备忘信息");
        }
    }
}
