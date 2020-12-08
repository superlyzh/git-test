package com.pluto.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //String --> Date Date --> String
        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);


        String  str = "2008-08-08 12:12:12";
        SimpleDateFormat slp2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = slp2.parse(str);
        System.out.println(parse);
    }
}
