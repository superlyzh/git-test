package com.pluto.date;

import java.util.Calendar;

/**
 * @author pluto
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();

        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH);
        int day = rightNow.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"年"+(month+1) + "月"+day+"日");


    }
}
