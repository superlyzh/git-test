package com.pluto.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
        //算算来到世界多少天
        Scanner sc  = new Scanner(System.in);

        System.out.println("请输入你的出生年月日:");
        String line = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(line);

        long myTime = d.getTime();
        long nowTime = System.currentTimeMillis();

        long oldTime = nowTime - myTime;

        int day = (int)((oldTime)/1000/60/60/24);
        System.out.println("你来到这个世界"+day+"天了");

    }
}
