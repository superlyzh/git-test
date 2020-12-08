package com.pluto;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {128,12,45,78,45,79,12,45,32,12,12};

        int index = min(arr);
        System.out.println("最小值为:"+arr[index]+"\n第一次出现的索引位置:"+index);

        int count = count(index,arr);
        System.out.println("一共出现了"+count+"次");
    }
    public static int min(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[index] > arr[i]){
                index = i;
            }
        }
        return index;
    }
    public static int count(int index,int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[index] == arr[i]){
                count++;
            }
        }
        return count;
    }
}
