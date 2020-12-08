package com.pluto.treeset;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("bj");
        set.add("hd");
        set.add("bj");
        set.add("sa");
        set.add("as");
        System.out.println(set);
    }
}
