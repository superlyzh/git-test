package com.pluto.regex;

import java.util.Scanner;

public class RegexDemo02 {
    public static void main(String[] args) {
    System.out.println("请输入你的QQ号码:");
        System.out.println(checkQQ(new Scanner(System.in).nextLine()));
    }
    public static  boolean checkQQ(String qq){
        //return qq.matches("[1-9][0-9]{4,14}");
        return qq.matches("[1-9]\\d{4,14}");
    }
}