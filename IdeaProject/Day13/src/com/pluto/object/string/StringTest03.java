package com.pluto.object.string;

public class StringTest03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        System.out.print("”[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length-1){
//                System.out.print(arr[i]+",");
//            }else{
//                System.out.println(arr[i]+"]“");
//            }
//        }

        String s = "";
        s +="[";

        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                s+=arr[i]+",";
            }else{
                s+=arr[i]+"]";
            }

        }
        System.out.println(s);

    }

    }

