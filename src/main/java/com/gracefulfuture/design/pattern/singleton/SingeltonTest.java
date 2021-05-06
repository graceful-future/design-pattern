package com.gracefulfuture.design.pattern.singleton;

import com.gracefulfuture.design.pattern.singleton.lazy.Singleton;

import java.util.concurrent.TimeUnit;

public class SingeltonTest {
    public static void main(String[] args){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstance();
                    System.out.println(singleton);
                }
            }).start();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstance();
                    System.out.println(singleton);
                }
            }).start();
    }
}
