package com.gracefulfuture.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理真实主题前置处理");
        method.invoke(obj,args);
        System.out.println("动态代理真实主题后置处理");
        return null;
    }
}
