package com.pluto.regex;

import java.util.Scanner;

public class RegexDemo04 {
    public static void main(String[] args) {
        System.out.println("请输入你的邮箱:");
        String email = new Scanner(System.in).nextLine();

        System.out.println(email.matches("\\w+@\\w{2,6}(\\.\\w{2,3})+"));
    }
}
