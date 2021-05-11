package com.gracefulfuture.design.pattern.decorator;

public class Succubus extends Changer{
    public Succubus(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger(){
        ((Original)super.morrigan).setImage("Morrigan1.jpg");
    }
}
