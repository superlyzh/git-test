package com.pluto.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String,String> hs = new HashMap<>();

        hs.put("杨颖","黄晓明");
        hs.put("习太太","习大大");
        hs.put("张太太","张三");
        hs.put("李太太","李四");
        hs.put("王太太","王五");


        Set<Map.Entry<String, String>> entrySet = hs.entrySet();
        for (Map.Entry<String,String> en:entrySet) {
            System.out.println(en.getKey()+"-----"+en.getValue());
        }
        System.out.println("---------");
        Set<String> key = hs.keySet();

        for (String name:key) {
            System.out.println(name+"-----"+hs.get(name));
        }

    }
}
