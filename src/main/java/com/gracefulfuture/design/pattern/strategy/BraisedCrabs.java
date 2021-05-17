package com.gracefulfuture.design.pattern.strategy;

import javax.swing.*;

//具体策略类：红烧大闸蟹
class BraisedCrabs extends JLabel implements CrabCooking {
    private static final long serialVersionUID = 1L;
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/main/java/com/gracefulfuture/design/pattern/strategy/BraisedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
