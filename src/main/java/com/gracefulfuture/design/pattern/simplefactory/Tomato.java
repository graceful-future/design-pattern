package com.gracefulfuture.design.pattern.simplefactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tomato implements Product{
    @Override
    public String getProductDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Product date of tomato:" + LocalDate.now().format(formatter);
    }
}
