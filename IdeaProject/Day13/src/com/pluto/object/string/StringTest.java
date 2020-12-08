package com.pluto.object.string;

public class StringTest {
    public static void main(String[] args) {
        //将一个字符串的首字母大写，其余为小写

        String s  = "helloWorld";

        String s1 = s.substring(0,1).toUpperCase();

        String s2 = s.substring(1).toLowerCase();

        s = s1 + s2;

        System.out.println(s);
    }
}
