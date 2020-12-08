package com.pluto.treeset;

import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";
        TreeMap<Character,Integer> tm = new TreeMap<>();

        char[] chs = s.toCharArray();
       for(char ch:chs){
           Integer i = tm.get(ch);
           if(i!= null){
               i++;
               tm.put(ch,i);
           }else{
               tm.put(ch,1);
           }
       }


        StringBuilder sb = new StringBuilder();
        for (Character c:tm.keySet()) {
            sb.append(c+"("+tm.get(c)+")");
        }
        System.out.println(sb.toString());
    }
}
