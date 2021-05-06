package com.gracefulfuture.design.pattern.singleton.sic;
//静态内部类
public class SICSingleton {
    private SICSingleton(){

    }
    private static class SingletonHolder{
        private static final SICSingleton INSTANCE = new SICSingleton();
    }
    public static SICSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
