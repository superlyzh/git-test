package com.pluto.lambda;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        int[] arr = {7532,23,2355,235,5325,54356,233,23,5,3425};
        printMax(()->{
            Arrays.sort(arr);
            return  arr[arr.length-1];
        });
    }
    public static  void printMax(Supplier<Integer> supplier){
        int max = supplier.get();
        System.out.println("max = "+ max);
    }
}
