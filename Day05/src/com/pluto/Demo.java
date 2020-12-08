package com.pluto;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {3,15,45,46,78,45,98,-5,12,45,87};

        int max = max(arr);
        System.out.println("最大值:"+max);
    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
