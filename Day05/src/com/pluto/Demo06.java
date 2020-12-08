package com.pluto;

public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int index = 1;
        int num = 5;

        int[] newArr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = newArr.length-2; i >= index; i--) {
                newArr[i+1] =newArr[i];
        }
        newArr[index] = 5;
        arr =newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
