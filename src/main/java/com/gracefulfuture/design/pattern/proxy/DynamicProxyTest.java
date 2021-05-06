package com.gracefulfuture.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new DynamicProxy(subject);
        subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[]{Subject.class},invocationHandler);
        subject.request();
    }
}
