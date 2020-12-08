package com.pluto.object.buffer;

public class StringBUfferTest03 {
    public static void main(String[] args) {
        int[] arr = {44,33,55,11,22};

        String s = StringBUfferTest03.concatArr(arr);
        System.out.println(s);
    }
    public static String concatArr(int[] arr){
        //用StringBuffer拼接
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!= arr.length-1){
                sb.append(arr[i]+",");
            }else{
                sb.append(arr[i]+"]");
            }
        }
        return sb.toString();
    }
}
