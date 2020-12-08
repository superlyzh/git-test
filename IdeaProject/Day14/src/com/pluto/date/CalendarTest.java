package com.pluto.date;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();

        int i = cl.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);

        cl.set(Calendar.DAY_OF_YEAR,22);
        System.out.println(cl.get(Calendar.DAY_OF_YEAR));
    }
}
