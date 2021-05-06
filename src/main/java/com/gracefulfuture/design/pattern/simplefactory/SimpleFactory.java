package com.gracefulfuture.design.pattern.simplefactory;

public class SimpleFactory {
    public static Product generateProduct(int type){
        switch (type){
            case TypeConstant.TOMATO:
                return new Tomato();
            case TypeConstant.POTATO:
                return new Potato();
            default:
                return null;
        }
    }
}
