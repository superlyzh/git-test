package com.pluto.regex;

public class RegexDemo07 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "hello172846djbsfkjgf3284786";

        //数字用*代替
        System.out.println(s.replaceAll("\\d","*"));

        //直接剔除数据
        System.out.println(s.replaceAll("\\d+",""));
    }
}
