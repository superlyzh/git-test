package com.pluto;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {128,12,45,78,45,79,12,45,32,12,12};

        sort(arr);
        printArray(arr);
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
