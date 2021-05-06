package com.gracefulfuture.design.pattern.proxy;

public class Proxy implements Subject{
    private RealSubject realSubject;
    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("访问真实主题前的预处理");
    }
    public void postRequest(){
        System.out.println("访问真实主题后的后处理");
    }
}
