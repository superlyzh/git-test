package com.pluto.homework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(32);
        set.add(323);
        set.add(43);
        for (Integer i:set ) {
            System.out.println(i);
        }

    }
}
