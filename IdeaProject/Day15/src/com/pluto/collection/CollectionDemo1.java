package com.pluto.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello1");
        c.add("hello2");
        c.add("hello3");
        c.add("hello4");

        System.out.println(c);

//        c.clear();
//        System.out.println(c);
//        System.out.println(c.remove("hello3"));
//        System.out.println(c);

//        System.out.println(c.contains("hello4"));
//        System.out.println(c);

//        System.out.println(c.isEmpty());

    }
}
