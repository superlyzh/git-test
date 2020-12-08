package com.pluto.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTimeTest {
    public static void main(String[] args) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2020-09-08");

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);

        String s1 = "1990-01-01";
        String s2  = "2020-09-08";

        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(s1);
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(s2);
        long startTime = date1.getTime();
        long endTime = date2.getTime();
        long nowTime = endTime - startTime;
        int day = (int)(nowTime/(1000*60*60*24));

        int fish = 0;
        int sunScreen = 0;

        for (int i = 0; i < day; i++) {
            if(i%5 == 1||i%5 == 2||i%5 == 3){
                fish++;
            }else if(i%5 == 0||i%5 == 4){
                sunScreen++;
            }
        }
        System.out.println(fish+sunScreen);
        System.out.println(day+"天里"+fish+"天在打鱼"+sunScreen+"天在晒网");


    }
}
