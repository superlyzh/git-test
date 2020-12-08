package com.pluto.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 17763
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Student("张三",18));
        c.add(new Student("李四",20));
        c.add(new Student("王五",24));

        Object[] objs = c.toArray();

        for (int i = 0; i < objs.length; i++) {
            Student stu = (Student) objs[i];
            System.out.println(stu.getName()+"---"+stu.getAge());
        }

        for (Object obj:c) {
            System.out.println(obj);
        }

    }

}
