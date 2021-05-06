package com.gracefulfuture.design.pattern.simplefactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Potato implements Product{
    @Override
    public String getProductDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Product date of potato:" + LocalDate.now().format(formatter);
    }
}
