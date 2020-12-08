package com.pluto.object.buffer;

import java.util.Scanner;

public class StringBufferTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据:");

        String s = sc.nextLine();
//
//        char[] chs = s.toCharArray();
//        String s2 = "";
//        for (int i = chs.length-1; i >= 0 ; i--) {
//            s2+=chs[i];
//        }
//
//        System.out.println(s2);

        System.out.println(new StringBuffer(s).reverse().toString());

    }
}
