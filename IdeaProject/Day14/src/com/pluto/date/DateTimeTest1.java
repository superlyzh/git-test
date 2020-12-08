package com.pluto.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeTest1 {
    public static void main(String[] args) {
       /* Date date1 = new Date(2020-1900,9-1,8);
        System.out.println(date1);*/

        LocalTime lt = LocalTime.now();
        LocalDate ld = LocalDate.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
        LocalDateTime ldt2  = LocalDateTime.
                of(2020,9,28,11,
                        22,22,22);

        System.out.println(ldt2);
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());

        LocalDateTime ldt3 = ldt.withDayOfMonth(22);
        System.out.println(ldt3);

        System.out.println(ldt.plusMonths(3));

        System.out.println(ldt.minusDays(5));


    }
}