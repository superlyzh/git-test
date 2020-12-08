package com.pluto.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(true){
            System.out.println("请输入数据:(0结束)");
            int num = sc.nextInt();
            if(num != 0){
                list.add(num);
            }else{
                break;
            }
        }

        System.out.println(list);
        Integer[] i = new Integer[list.size()];
        list.toArray(i);
        System.out.println(list.size());

        System.out.println("数组为"+ListTOString(i));
        System.out.println("最大值为"+i[i.length-1]);
       // System.out.println(i[i.length-1]);
    }
    public static String ListTOString(Integer[] i){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < i.length; x++) {
            if(x == i.length - 1){
                sb.append(i[x]+"]");
            }else{
                sb.append((i[x])).append(",");
            }
        }
        return sb.toString();
    }
}

