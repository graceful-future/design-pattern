package com.gracefulfuture.design.pattern.singleton.dcl;
//双重检测锁
public class DCLSingleton {
    private static volatile DCLSingleton DCLSingleton;
    private DCLSingleton(){

    }
    public static DCLSingleton getInstance(){
        if(DCLSingleton == null){
            synchronized (DCLSingleton.class){
                if(DCLSingleton == null){
                    DCLSingleton = new DCLSingleton();
                }
            }
        }
        return DCLSingleton;
    }
}
