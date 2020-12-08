package com.pluto;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        int[] arr = {12,54,96,58,78,56,21,34,68,89,87,52};

        sort(arr);
        System.out.println("请输入你要找的数:");
        int i =binaryfound(new Scanner(System.in).nextInt(),arr);
        if(i != -1){
            System.out.println("找到了"+i);
        }else {
            System.out.println("没找到"+i);
        }
        Demo04.printArray(arr);
    }

    private static int binaryfound(int value, int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = (startIndex+endIndex)/2;
        int index = -1;

        while(startIndex <= endIndex){
            if(arr[mid] == value){
                index = mid;
                break;
            }else if(arr[mid] > value){
                endIndex = --mid;
            }else {
                startIndex = ++mid;
            }
            mid = (startIndex+endIndex)/2;
        }
        return index;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0;j < arr.length -1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
