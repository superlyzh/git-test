package com.pluto.method;

public class Demo1 {

    public static int add(int ...a){
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
