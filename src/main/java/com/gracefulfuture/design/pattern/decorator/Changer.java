package com.gracefulfuture.design.pattern.decorator;

public class Changer implements Morrigan{
    Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
        morrigan.display();
    }
}
