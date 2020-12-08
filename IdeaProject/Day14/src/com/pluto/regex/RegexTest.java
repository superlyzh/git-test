package com.pluto.regex;

import java.util.Arrays;

public class RegexTest {
    public static void main(String[] args) {
        String s = "91   27   46  38  50";

        String[] str = s.split(" +");

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }


        System.out.println("\n---------------------");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                sb.append(arr[i]+" ");
            }else{
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString().trim());
    }
}
