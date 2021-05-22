package com.gracefulfuture.design.pattern.memento;

/**
* @description      管理者
* @author           chenkun
* @create           2021/5/22 16:14
* @version          1.0
*/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
