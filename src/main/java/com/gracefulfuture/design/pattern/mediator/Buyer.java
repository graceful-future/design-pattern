package com.gracefulfuture.design.pattern.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Buyer extends Customer{

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Buyer(String name) {
        super(name);
        clientWindow(600,100);
    }

    @Override
    public void send(String advertisement) {
        LocalDateTime localDateTime = LocalDateTime.now();
        receiveArea.append("我(买方)说: " + advertisement + "\t" + localDateTime.format(formatter) + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
        medium.relay(name, advertisement);
    }

    @Override
    public void receive(String from, String advertisement) {
        LocalDateTime localDateTime = LocalDateTime.now();
        receiveArea.append(from + "说: " + advertisement + "\t" + localDateTime.format(formatter) + "\n");
        //使滚动条滚动到最底端
        receiveArea.setCaretPosition(receiveArea.getText().length());
    }
}
