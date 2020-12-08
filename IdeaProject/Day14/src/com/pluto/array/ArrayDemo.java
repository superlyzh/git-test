package com.pluto.array;

public class ArrayDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三",16);
        Student s2 = new Student("李四",17);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("赵六",19);
        Student s5 = new Student("小七",20);

        Student[] stubs = {s1,s2,s3,s4,s5};

        for (int i = 0; i < stubs.length; i++) {
            System.out.println("["+stubs[i].getName()+"---"+stubs[i].getAge()+"]");
        }
    }
}
