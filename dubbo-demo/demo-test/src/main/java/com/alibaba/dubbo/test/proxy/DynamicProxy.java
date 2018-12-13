package com.alibaba.dubbo.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object subject;

    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before rent house");
        if (method.getName().startsWith("arg")) {
            System.out.println(args[0]);
        }
        method.invoke(subject, args);
        System.out.println("after rent house");
        return null;
    }
}
