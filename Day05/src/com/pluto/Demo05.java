package com.pluto;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        rever(arr);
        printArray(arr);
    }
    public static void rever(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
