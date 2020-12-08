package com.pluto.linkedlist;

import java.util.LinkedList;

/**
 * @author 17763
 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(123);
        list.add(456);
        list.addFirst(0103253);
        list.addLast(888);
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list);
    }
}
