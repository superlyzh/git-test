package com.pluto.linkedlist;

import sun.security.krb5.internal.HostAddress;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList<Cat> list = new LinkedList<>();

        list.addFirst(new Cat("joy",2));
        list.addLast(new Cat("pol",1));
        list.add(0,new Cat("tim",3));

        Iterator<Cat> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
