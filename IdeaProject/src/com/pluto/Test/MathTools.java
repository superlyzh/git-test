package com.pluto.Test;

public class MathTools {
    //判断两个数是否相等
     static boolean equal(int a,int b){
        return a == b;
    }
    //判断是否是素数
   static  boolean isPrime(int a){
        if(a == 1){
            return false;
        }
        for (int i = 2; i < a; i++) {
            if(a == 2){
                return true;
            }else if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    //约数

     static void appro(int a){
        for (int i = 1; i < a; i++) {
            if (a % i == 0){
                System.out.print(i+"\t");
            }
        }
    }
}
