package com.gracefulfuture.design.pattern;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        System.out.println(localDate.format(formatter));
//        LocalDate yesterday = localDate.plusDays(-1);
//        System.out.println(localDate.format(formatter));
//        System.out.println(yesterday.format(formatter));
        LocalDate startDate = LocalDate.parse("2020-04-25");
        LocalDate endDate = LocalDate.parse("2020-05-30");
//        int days = startDate.until(endDate).getDays();
//        long between = ChronoUnit.DAYS.between(startDate, endDate);
//        System.out.println(endDate.compareTo(startDate));
//        System.out.println(days);
//        System.out.println(between);
        int days2 = Period.between(startDate, endDate).getDays();
        System.out.println(days2);
        System.out.println(ChronoUnit.DAYS.between(startDate,endDate));
        System.out.println(ChronoUnit.MONTHS.between(startDate,endDate));
        System.out.println(startDate.plusMonths(2));
//        System.out.println(null + "hello");
    }
}
