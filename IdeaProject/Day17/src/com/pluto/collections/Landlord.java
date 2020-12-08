package com.pluto.collections;

import java.util.ArrayList;
import java.util.Collections;


public class Landlord {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        String[] color ={"♠","♥","♣","♦"};
        String[] grade = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        array.add("大王");
        array.add("小王");

        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < grade.length; j++) {
                array.add(color[i].concat(grade[j]));
            }
        }
        Collections.shuffle(array);
     /*   for (String s:array) {
            System.out.println(s);
        }*/

        ArrayList<String> zhangsan = new ArrayList<>();
        ArrayList<String> lisi = new ArrayList<>();
        ArrayList<String> dizhu = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            if(i > array.size()-4) {
                dipai.add(array.get(i));
            }
            else if(i%3 == 1){
                zhangsan.add(array.get(i));
            }else if(i%3 == 2){
                lisi.add(array.get(i));
            }else{
                dizhu.add(array.get(i));
            }
        }
        Collections.sort(zhangsan);

        Collections.sort(lisi);
        Collections.sort(dizhu);
        Collections.sort(dipai);
        lookPoker("张三",zhangsan);
        lookPoker("李四",lisi);
        lookPoker("地主",dizhu);
        lookPoker("底牌",dipai);
    }
        public static void lookPoker(String name, ArrayList<String> array){
            System.out.println(name+"的牌是:");
            for (String s:array) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }

