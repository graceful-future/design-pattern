package com.gracefulfuture.design.pattern.mediator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Customer extends JFrame implements ActionListener {
    protected String name;
    protected Medium medium;
    protected JTextArea sendArea;
    protected JTextArea receiveArea;
    public Customer(String name) {
        super(name);
        this.name = name;
    }

    void clientWindow(int x, int y) {
        Container cp;
        JScrollPane sp;
        JPanel p1, p2;
        cp = this.getContentPane();
        sendArea = new JTextArea(10,40);
        Color color = new Color(215, 203, 189);
        Font font = new Font("宋体",Font.BOLD,16);
        JButton jButton = new JButton("发送");
        jButton.addActionListener(this);
        sendArea.setBackground(color);
        sendArea.setFont(font);
        receiveArea = new JTextArea(10, 50);
        receiveArea.setBackground(color);
        receiveArea.setFont(font);
        receiveArea.setEditable(false);
        p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(receiveArea);
        sp = new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(sendArea);
        p2.add(jButton);
        cp.add(p2, BorderLayout.SOUTH);
        this.setLocation(x, y);
        this.setSize(500, 550);
        this.setResizable(false); //窗口大小不可调整
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo = sendArea.getText().trim();
        sendArea.setText("");
        this.send(tempInfo);
    }

    public String getName() {
        return name;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public abstract void send(String advertisement);

    public abstract void receive(String from,String advertisement);
}
