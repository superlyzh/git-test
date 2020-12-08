package com.pluto.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class LandlordHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        String[] color = {"♠", "♥", "♣", "♦"};
        String[] grade = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};

        int index = 0;
        for (String grades : grade) {
            for (String colors : color) {
                String poker = colors.concat(grades);
                hm.put(index, poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        TreeSet<Integer> zhangsan = new TreeSet<Integer>();
        TreeSet<Integer> lisi = new  TreeSet<Integer>();
        TreeSet<Integer> dizhu = new  TreeSet<Integer>();
        TreeSet<Integer> dipai = new  TreeSet<Integer>();

        Collections.shuffle(array);

        for (int i = 0; i < array.size(); i++) {
            if (i > array.size() - 4) {
                dipai.add(array.get(i));
            } else if (i % 3 == 1) {
                zhangsan.add(array.get(i));
            } else if (i % 3 == 2) {
                lisi.add(array.get(i));
            } else {
                dizhu.add(array.get(i));
            }
        }
        Collections.sort(array);
        lookPoker("张三",zhangsan,hm);
        lookPoker("李四",lisi,hm);
        lookPoker("地主",dizhu,hm);
        lookPoker("底牌",dipai,hm);
    }
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String>hs){
        System.out.println(name+"的牌是:");
        for (Integer s:ts) {
            System.out.print(hs.get(s)+" ");
        }
        System.out.println();
    }
}
