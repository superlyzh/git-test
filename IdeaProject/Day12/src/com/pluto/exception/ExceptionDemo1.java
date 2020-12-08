package com.pluto.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        String s = "2019-04-20";

        TemporalAccessor parse = DateTimeFormatter.ofPattern("yyyy-MM-dd").parse(s);
        System.out.println(parse);
    }
}
