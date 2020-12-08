package com.pluto.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private DateUtil(){
    }

    public static String DateToString(Date d, String format){
        return new SimpleDateFormat(format).format(d);
    }
    public static  Date StringToDate(String s,String format) throws ParseException {
        return new SimpleDateFormat(format).parse(s);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(DateToString(new Date(), "yyyy-MM-dd HH:mm:ss"));

        System.out.println(StringToDate("2020-09-09 12:12:12", "yyyy-MM-dd HH:mm:ss"));
    }
}
