package com.gracefulfuture.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Component{
    private List<Component> children = new ArrayList<>();
    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}
