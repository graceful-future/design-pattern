package com.gracefulfuture.design.pattern.bridge;

public class HandBag extends LeatherBag{
    @Override
    public String getName() {
        return color.getColor() + " HandBag";
    }
}
