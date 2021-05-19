package com.gracefulfuture.design.pattern;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumericTest {
    public static void main(String[] args) {
        BigDecimal decimal1 = new BigDecimal(0.8200);
        BigDecimal decimal2 = new BigDecimal(0.8516);
//        System.out.println(decimal1.subtract(decimal2));
//        System.out.println(decimal1.subtract(decimal2).divide(decimal2,2, RoundingMode.HALF_UP));
        System.out.println(decimal1.multiply(new BigDecimal(100)).setScale(2,RoundingMode.HALF_UP));
    }
}
