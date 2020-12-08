package com.pluto.method;

public class Demo02 {

    public static int max(int a,int b){
        return a > b?a:b;
    }
    public static int max(int a,int b,int c){
        return a>b?(a>c?a:c):(b>c?b:c);
    }
    public  static double max(double a,double b){
        return a>b?a:b;
    }
}
