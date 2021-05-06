package com.gracefulfuture.design.pattern.singleton.lazy;


import java.util.concurrent.TimeUnit;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
