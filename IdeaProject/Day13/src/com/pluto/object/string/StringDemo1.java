package com.pluto.object.string;

public class StringDemo1 {
    public static void main(String[] args) {
        //字符串替换功能
        String s1 = "helloworld";
        String s2 = s1.replace('l','k');
        String s3 = s1.replace("owo","ak47");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //去除字符串两端空格

        String ss1 ="      helloWorld      ";
        String ss2 = ss1.trim();
        System.out.println(ss1);
        System.out.println(ss2);

        //按字典顺序比较两个字符串
        String sss1 = "hello";
        String sss2 = "hello";
        String sss3 = "abc";
        String sss4 = "xyz";
        System.out.println(sss1.compareTo(sss2));
        System.out.println(sss1.compareTo(sss3));
        System.out.println(sss1.compareTo(sss4));
    }
}
