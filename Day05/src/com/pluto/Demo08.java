package com.pluto;

public class Demo08 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,15,17,19};

        int startIndex = 0;
        int endStart = arr.length-1;
        int mid = (startIndex+endStart)/2;
        int index = -1;
        int value = 18;
        while(startIndex <= endStart){
            if(arr[mid] == value){
                index = mid;
                break;
            }else if(arr[mid] < value){
                startIndex = mid + 1;
            }else{
                endStart = mid - 1;
            }
            mid = (startIndex+endStart)/2;
        }
        if (index==-1){
            System.out.println("没找到!");
        }else{
            System.out.println("找到了,索引为"+index);
        }
    }
}
