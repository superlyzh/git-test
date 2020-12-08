package com.pluto.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayTest05 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random rd = new Random();
        for(int i = 0; i < 30; i++){
            list.add((char) rd.nextInt(26) + 97);
        }
        for (Object o:list) {
            System.out.println(o);
        }
    }
}

