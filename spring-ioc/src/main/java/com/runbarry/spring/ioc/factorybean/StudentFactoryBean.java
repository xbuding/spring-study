package com.runbarry.spring.ioc.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author xbuding
 * @version 1.0
 * @since 2020/5/11
 */
@Component
public class StudentFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Student("张小凡", 20);
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
