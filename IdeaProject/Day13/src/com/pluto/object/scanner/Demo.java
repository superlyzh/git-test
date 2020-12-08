package com.pluto.object.scanner;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个整数");
        if(sc.hasNextInt()){
            int x = sc.nextInt();
            System.out.println("x:"+x);
        }else{
            System.out.println("你的输入有误!");
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a:"+a+"b:"+b);


    }
}
