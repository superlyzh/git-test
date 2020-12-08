package com.pluto.object.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        printArray(arr);
        sort(arr);
        printArray(arr);

    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                System.out.print(arr[i]+",");
            }else{
                System.out.println(arr[i]+"]");
            }
        }
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] >arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
