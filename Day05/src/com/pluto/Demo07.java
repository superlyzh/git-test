package com.pluto;

public class Demo07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 1;

        for (int i = 0; i < arr.length-1; i++) {
            if(index <= i){
                arr[i] = arr[i+1];
            }
        }

        arr[arr.length-1] = 0;
        Demo04.printArray(arr);
    }
}
