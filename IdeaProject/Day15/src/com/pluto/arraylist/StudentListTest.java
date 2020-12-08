package com.pluto.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentListTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(new Student("张三",70));
        c.add(new Student("李四",56));
        c.add(new Student("王五",65));
        c.add(new Student("赵六",57));
        c.add(new Student("麻子",90));

        for (Object obj:c ) {
            System.out.println(obj);
        }

        Iterator it = c.iterator();

        while (it.hasNext()){
            Student s = (Student)it.next();
            if(s.getScore()<60){
                it.remove();
            }

        }
        System.out.println("--------------");
        for (Object obj:c ) {
            System.out.println(obj);
        }
    }
}
