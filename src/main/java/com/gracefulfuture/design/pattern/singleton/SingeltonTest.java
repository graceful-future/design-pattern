package com.gracefulfuture.design.pattern.singleton;


import com.gracefulfuture.design.pattern.singleton.sic.SICSingleton;

public class SingeltonTest {
    public static void main(String[] args){
            new Thread(() -> {
                SICSingleton sicSingleton = SICSingleton.getInstance();
                System.out.println(sicSingleton);
            }).start();
            new Thread(() -> {
                SICSingleton sicSingleton = SICSingleton.getInstance();
                System.out.println(sicSingleton);
            }).start();
    }
}
