package com.pluto;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {23,1,4,66,14};

        System.out.println("请输入你要找的数:");
        int num = new Scanner(System.in).nextInt();
        int index = found(arr,num);

        if (index != -1){
            System.out.println("找到了，索引为:"+index);
        }else {
            System.out.println("没找到");
        }
        System.out.println(arr[index]);
    }

    public static int found(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
