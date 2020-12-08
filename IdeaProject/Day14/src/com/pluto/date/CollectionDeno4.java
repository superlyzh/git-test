package com.pluto.date;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class CollectionDeno4 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(2);


        for (int i = 3; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0){
                 isPrime = false;
                 break;
                }
                } if(isPrime){
                c.add(i);
            }


            }
     /*   for (Object o:c) {
            System.out.println(o);
        }*/
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object next = it.next();
            if((Integer) next%10==3){
                it.remove();
            }
        }
        System.out.println(c);

        c.remove(11);
        System.out.println(c.size());

        Collection c2 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c2.add((Integer)new Random().nextInt(100));
        }
        c.retainAll(c2);
        System.out.println(c);
    }
    }

