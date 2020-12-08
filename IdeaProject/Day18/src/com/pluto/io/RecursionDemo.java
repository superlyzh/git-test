package com.pluto.io;

/**
 * @author 17763
 * 递归
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int i = factorial(20);
        System.out.println(i);
    }

    private static int factorial(int i) {
        if(i == 2 || i == 1){
            return 1;
        }
            return factorial(i-1)+factorial(i-2);

    }
}
