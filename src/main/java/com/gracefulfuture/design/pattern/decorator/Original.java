package com.gracefulfuture.design.pattern.decorator;

import javax.swing.*;
import java.awt.*;

public class Original extends JFrame implements Morrigan{
    private String image = "Morrigan0.jpg";
    public Original(){
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel jLabel = new JLabel(new ImageIcon("src/main/java/com/gracefulfuture/design/pattern/decorator/" + image));
        this.add(jLabel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
