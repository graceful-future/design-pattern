package com.gracefulfuture.design.pattern.proxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("访问真实主题方法");
    }
}
