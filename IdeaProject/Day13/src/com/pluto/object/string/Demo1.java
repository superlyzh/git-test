package com.pluto.object.string;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        String s  = new Scanner(System.in).next();

        int bigNum = 0;
        int smallNum = 0;
        int num = 0;


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                bigNum++;
            }else if(ch >= 'a'&&ch <= 'z'){
                smallNum++;
            }else if(ch >= '0'&&ch <= '9'){
                num++;
            }
        }

        System.out.println("大写字母有"+bigNum+"个");
        System.out.println("小写字母有"+smallNum+"个");
        System.out.println("数字有"+num+"个");
    }
}
