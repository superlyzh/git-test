package com.pluto.exception;

public class ExcxeptionDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int[] arr =new int[3];
        try {
            System.out.println(a / b);
            //System.out.println(arr[3]);
            System.out.println("?异常");
        }catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        System.out.println("over");
    }
}
