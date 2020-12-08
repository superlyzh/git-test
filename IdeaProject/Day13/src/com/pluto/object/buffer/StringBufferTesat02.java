package com.pluto.object.buffer;

import java.util.Scanner;

/*
比较字符串是否对称
 */
public class StringBufferTesat02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        System.out.println(StringBufferTesat02.isSame(s));
    }
    public static boolean isSame(String s){
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
