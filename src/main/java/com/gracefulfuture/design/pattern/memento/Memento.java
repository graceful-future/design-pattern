package com.gracefulfuture.design.pattern.memento;

/**
* @description      备忘录
* @author           chenkun
* @create           2021/5/22 16:07
* @version          1.0
*/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
