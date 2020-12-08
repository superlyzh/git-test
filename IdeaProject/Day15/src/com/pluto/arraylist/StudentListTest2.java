package com.pluto.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListTest2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Student("王五",65));
        list.add(new Student("赵六",57));
        list.add(new Student("麻子",90));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------");
        for (Object obj: list) {
            System.out.println(obj);
        }

        System.out.println("--------------");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
