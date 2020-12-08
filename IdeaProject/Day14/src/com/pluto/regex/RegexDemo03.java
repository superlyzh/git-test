package com.pluto.regex;

import java.util.Scanner;

public class RegexDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入你的手机号码:");

        String phone = new Scanner(System.in).nextLine();

        //13/18开头,11位
        System.out.println(phone.matches("[1][38]\\d{9}"));
    }
}
