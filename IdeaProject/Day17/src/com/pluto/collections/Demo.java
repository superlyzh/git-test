package com.pluto.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        System.out.println(Collections.addAll(list, "hello", "world", "java","abc",
                "sda","sm","dd"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, "java"));

    }
}
