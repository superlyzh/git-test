package com.pluto.object.integer;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //十进制转其他进制
        System.out.println(Integer.toString(100,20));
        //其他进制到十进制
        System.out.println(Integer.parseInt("50",20));
    }
}
