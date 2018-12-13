package com.alibaba.dubbo.test.proxy.impl;

import com.alibaba.dubbo.test.proxy.Subject;

public class RealSubject implements Subject {

    @Override public void rent() {
        System.out.println("i want to rent my house");
    }

    @Override public void hello(String str) {
        System.out.println("hello" + str);
    }

    @Override public void test() {
        System.out.println("this is a test project");
    }

    @Override public String argsTest(String arg0, String arg1) {
        return arg0 + arg1;
    }
}
