package com.pluto.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArryTest04 {
    public static void main(String[] args) {
        List list  = new ArrayList();

        for (int i = 0; i < 30; i++) {
            Integer integer = (Integer)new Random().nextInt(99)+2;
            list.add(integer);
        }
        System.out.println("三十个随机数:"+list);

        List isp = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Integer it = (Integer)o;
            boolean falg = true;
            for (int j = 2; j < it; j++) {
                if(it%j == 0){
                    falg = false;
                    break;
                }
                }
            if(falg){
                isp.add(it);
            }

            }
        System.out.println("其中的质数:"+isp);
        }


    }


