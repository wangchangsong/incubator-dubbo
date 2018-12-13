package com.alibaba.dubbo.test.proxy;

import com.alibaba.dubbo.test.proxy.impl.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        Subject realSubject = new RealSubject();

        InvocationHandler handler = new DynamicProxy(realSubject);

        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);


        subject.test();

        subject.argsTest("this", "is");

        subject.hello("what is your name");


    }

}
