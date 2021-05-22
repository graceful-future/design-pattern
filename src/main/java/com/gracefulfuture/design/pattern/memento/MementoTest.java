package com.gracefulfuture.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
* @description      备忘录模式测试
* @author           chenkun
* @create           2021/5/22 16:05
* @version          1.0
*/
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("S0");
        System.out.println("初始状态：" + originator.getState());
        caretaker.setMemento(originator.createMemento());
        originator.setState("S1");
        System.out.println("新的状态：" + originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后的状态：" + originator.getState());
    }
}
