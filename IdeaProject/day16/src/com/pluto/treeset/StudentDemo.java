package com.pluto.treeset;

import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
    TreeSet<Student> tree = new TreeSet<>();

    Student s1 = new Student("马云",30);
    Student s2 = new Student("马化腾",40);
    Student s3 = new Student("王思聪",32);
    Student s4 = new Student("萨哈",34);
    Student s5 = new Student("增加",34);

        tree.add(s1);
        tree.add(s2);
        tree.add(s3);
        tree.add(s4);
        tree.add(s5);

        for (Student s:tree) {
            System.out.println(s);
        }

    }
}