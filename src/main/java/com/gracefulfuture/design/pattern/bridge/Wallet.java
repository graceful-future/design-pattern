package com.gracefulfuture.design.pattern.bridge;

public class Wallet extends LeatherBag{
    @Override
    public String getName() {
        return color.getColor() + " Wallet";
    }
}
