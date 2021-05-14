package com.gracefulfuture.design.pattern.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Component branch1 = new Branch();
        Component branch2 = new Branch();
        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        Component leaf3 = new Leaf("leaf3");
        branch1.add(leaf1);
        branch2.add(leaf2);
        branch2.add(leaf3);
        branch1.add(branch2);
        branch1.operation();
    }
}
