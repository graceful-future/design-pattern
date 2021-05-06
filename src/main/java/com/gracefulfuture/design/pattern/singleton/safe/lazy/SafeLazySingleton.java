package com.gracefulfuture.design.pattern.singleton.safe.lazy;
//线程安全的懒汉式
public class SafeLazySingleton {
    private static SafeLazySingleton instance = null;
    private SafeLazySingleton(){

    }
    public static synchronized SafeLazySingleton getInstance(){
        if(instance == null){
            instance = new SafeLazySingleton();
        }
        return instance;
    }
}
