package com.pluto.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author pluto
 * list:有序，可重复
 * 有索引，可通过索引操作数据
 * set:不可重复，无序
 */
public class ListTest {
    @Test
    public  void add(){
        List list = new ArrayList();

        list.add("tom");
        list.add(1,"jack");

        List list1 = new ArrayList();
        list1.add(0,123);
        list1.add(0,456);

        System.out.println(list);
        list.addAll(0,list1);
        System.out.println(list);
    }

    @Test
    public void get(){
        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        list.add("22");

        System.out.println(list.get(1));

        List list1 = list.subList(1,3);
        System.out.println(list1);

        System.out.println(list.indexOf("22"));
        System.out.println(list.indexOf("12"));
        System.out.println(list.lastIndexOf("22"));
    }

    @Test
    public void remove(){
        List list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        list.add("22");

        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.set(3, "44"));
        System.out.println(list);

    }
    @Test
    public void test() {
        Random ran = new Random();
        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            Integer random = Integer.valueOf(ran.nextInt(100));
            if(random%2 == 0){
                list.add(random);
                continue;
            }
            i--;

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println("\n---------");
        for (Object o:list) {
            System.out.print(o+"\t");
        }
        System.out.println("\n---------");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
    }
}

