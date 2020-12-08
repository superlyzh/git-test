package com.pluto.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayTest03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            int i1 = rd.nextInt(100 )+1;
            if(!list.contains(i1)){
                list.add(i1);
                continue;
            }
            i--;
        }
        System.out.println("十个随机数"+list);

        List maxList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Integer max = (Integer) list.get(0);
            for (int j = 0; j < list.size(); j++) {
                Integer num = (Integer) list.get(j);
                if(max < num){
                    max = num;
                }
        }
            maxList.add(max);
            list.remove(max);
        }
        System.out.println("前三个最大的值"+maxList);
        System.out.println("删除后"+list);
    }
    
}
