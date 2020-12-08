package com.pluto.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo02 {
    public static void main(String[] args) {
        //获取任意一年二月的天数
        Scanner sc  =  new Scanner(System.in);
        System.out.println("请输入年份:");
        int year  = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE));
    }
}
