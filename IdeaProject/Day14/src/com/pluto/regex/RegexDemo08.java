package com.pluto.regex;

import java.util.Scanner;

/*
获取任意范围之间的随机数
 */
public class RegexDemo08 {
    public static void main(String[] args) {
        System.out.println("请输入双边界限值:");
        int i =50;
        while(i > 0) {
            System.out.println(getRandom(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));
        i--;
        }
    }
    public static  int getRandom(int start,int end){
        return (int)(Math.random()*(end - start +1) + start);
    }
}
