package com.pluto.linkedlist;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<User> hs = new HashSet();

        hs.add(new User("张三","1234"));
        hs.add(new User("李四","2345"));
        hs.add(new User("王五","6789"));
        hs.add(new User("赵六","7890"));
        hs.add(new User("张三","1234"));

        Iterator<User> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
