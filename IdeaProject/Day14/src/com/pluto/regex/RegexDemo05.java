package com.pluto.regex;

import java.util.Scanner;

/*
正则分割
 */
public class RegexDemo05 {
    public static void main(String[] args) {
        //定义一个年龄搜索范围
        String ages = "18-24";

        //定义规则
        String regex = "-";

        //调用方法
        String[] strArray = ages.split(regex);
        int startAge = Integer.parseInt(strArray[0]);
        int endAge = Integer.parseInt(strArray[1]);

        //键盘录入年龄
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        while(true) {
            int age = sc.nextInt();
            if (age >= startAge && age <= endAge) {
                System.out.println("就是你了");
                break;
            } else {
                System.out.println("byebye,请下一个输入年龄:");
            }
        }
    }
}
