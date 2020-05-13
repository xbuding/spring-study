package com.runbarry.spring;

import com.runbarry.spring.ioc.reflection.MemberController;
import com.runbarry.spring.ioc.reflection.MemberService;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xbuding
 * @version 1.0
 * @since 2020/5/11
 */
public class ReflectionTest {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MemberController memberController = new MemberController();
        Class<? extends MemberController> clazz = memberController.getClass();
        Field serviceFiled = clazz.getDeclaredField("memberService");
        serviceFiled.setAccessible(true);

        MemberService memberService = new MemberService();
        System.err.println("--------" + memberService.toString());
        String upName = serviceFiled.getName().substring(0, 1).toUpperCase() + serviceFiled.getName().substring(1);
        String setMethodName = "set" + upName;
        String getMethodName = "get" + upName;
        Method setMethod = clazz.getMethod(setMethodName, MemberService.class);
        setMethod.invoke(memberController, memberService);

        Method getMethod = clazz.getMethod(getMethodName);
        System.err.println(getMethod.invoke(memberController));
    }
}
