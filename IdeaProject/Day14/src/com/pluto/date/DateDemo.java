package com.pluto.date;

import java.util.Date;

public class  DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        //获取毫秒值
       Date d3 = new Date(d.getTime());
        System.out.println(d3);
        System.out.println(d);

        Date d2 = new Date(System.currentTimeMillis());
        System.out.println(d2);
    }

}
