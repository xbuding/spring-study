package com.runbarry.spring;

import com.runbarry.spring.ioc.factorybean.AppConfiguration;
import com.runbarry.spring.ioc.factorybean.Student;
import com.runbarry.spring.ioc.factorybean.StudentFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xbuding
 * @version 1.0
 * @since 2020/5/11
 */
public class FactoryBeanTest {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        // 得到的是student
        System.out.println(context.getBean("studentFactoryBean"));
        // 得到的是student工厂
        System.out.println(context.getBean("&studentFactoryBean"));

        //
        StudentFactoryBean factoryBean = (StudentFactoryBean) context.getBean("&studentFactoryBean");
        //
        Student object = (Student) factoryBean.getObject();
        object.setAge(2);

        //
        Student object2 = (Student) factoryBean.getObject();
        System.out.println(object2);
    }
}
