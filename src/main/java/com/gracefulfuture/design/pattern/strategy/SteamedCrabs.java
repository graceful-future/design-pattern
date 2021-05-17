package com.gracefulfuture.design.pattern.strategy;

import javax.swing.*;

//具体策略类：清蒸大闸蟹
class SteamedCrabs extends JLabel implements CrabCooking {
    private static final long serialVersionUID = 1L;
    public void cookingMethod() {
        this.setIcon(new ImageIcon("src/main/java/com/gracefulfuture/design/pattern/strategy/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
