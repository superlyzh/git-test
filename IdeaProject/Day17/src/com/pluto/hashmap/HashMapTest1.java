package com.pluto.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 17763
 */
public class HashMapTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = new HashMap<String,String>(10);

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"个学员姓名:");
            String name = sc.nextLine();
            System.out.println("请输入第"+(i+1)+"个学员电话:");
            String phone = sc.nextLine();
            map.put(name,phone);
        }

        for (String s:map.keySet()) {
            System.out.println("姓名:"+s+"\t电话"+map.get(s));
        }

        System.out.println("请输入查找的学生姓名");
        String name = sc.nextLine();
        System.out.println("姓名:"+name+"电话"+map.get(name));

    }
}
