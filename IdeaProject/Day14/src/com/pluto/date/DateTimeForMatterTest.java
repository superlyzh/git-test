package com.pluto.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateTimeForMatterTest {

    public static void main(String[] args) {
        //格式化或解析日期
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));

//        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(isoLocalDateTime.parse("2020-09-11T19:01:59.989"));

        //日期格式化
        System.out.println(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.SHORT).format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.LONG).format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.LONG).format(LocalDateTime.now()));

        System.out.println(DateTimeFormatter.
                ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));

        //字符串转日期
        TemporalAccessor parse = DateTimeFormatter.
                ofPattern("yyyy-MM-dd HH:mm:ss").parse("2020-09-28 18:26:30");
        System.out.println(parse);
    }
}
