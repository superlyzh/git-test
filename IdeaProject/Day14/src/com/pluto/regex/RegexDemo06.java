package com.pluto.regex;

public class RegexDemo06 {
    public static void main(String[] args) {
        String s1 = "aa,bb,cc";
        String[] str = s1.split(",");

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("---------------");
        String s2 = "aa.bb.cc";
        String[] str2 = s2.split("\\.");

        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
        System.out.println("---------------");
        String s3 = "aa     bb           cc";
        String[] str3 = s3.split(" +");

        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }
        System.out.println("---------------");
        String s4 = "D:\\Java200821\\day05\\homework";
        String[] str4 = s4.split("\\\\");

        for (int i = 0; i < str4.length; i++) {
            System.out.println(str4[i]);
        }
    }
}
