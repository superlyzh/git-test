package com.pluto.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        /*
                集合遍历
         */
        Collection c1 = new ArrayList();
        c1.add("hello");
        c1.add("world");
        c1.add("java");

        Object[] objs = c1.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);
            System.out.println(((String)objs[i]).length());
        }
    }
}
