package com.gracefulfuture.design.pattern.bridge;

public abstract class LeatherBag {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract String getName();
}
