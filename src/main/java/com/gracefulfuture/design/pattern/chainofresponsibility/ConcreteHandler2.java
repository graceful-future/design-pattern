package com.gracefulfuture.design.pattern.chainofresponsibility;

public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String request) {
        if("two".equals(request)){
            System.out.println("具体处理者2负责处理该请求");
        }else{
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没有处理者处理该请求");
            }
        }
    }
}
