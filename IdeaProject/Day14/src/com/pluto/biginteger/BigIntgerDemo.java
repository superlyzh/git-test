package com.pluto.biginteger;

import java.math.BigInteger;

public class BigIntgerDemo {
    public static void main(String[] args) {
//        Integer i = new Integer(100);
//        System.out.println(i);
//        System.out.println(Integer.MAX_VALUE);
//        Integer ii = new Integer(2147483647);
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        System.out.println("add:"+bi1.add(bi2));
        System.out.println("subtract:"+bi1.subtract(bi2));
        System.out.println("multiply:"+bi1.multiply(bi2));
        System.out.println("divide:"+bi1.divide(bi2));

        BigInteger[] bit = bi1.divideAndRemainder(bi2);
        System.out.println("商:"+bit[0]);
        System.out.println("商:"+bit[1]);
    }
}
