package com.pluto.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Map<String, ArrayList<Student>> map = new HashMap<String,ArrayList<Student>>();
        ArrayList<Student> array1 = new ArrayList<>();

        Student s1 = new Student("张三","001");
        Student s2 = new Student("李三","002");
        Student s3 = new Student("王三","003");
        Student s4 = new Student("赵三","004");

        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        array1.add(s4);
        map.put(s1.getName(),array1);

        ArrayList<Student> array2 = new ArrayList<>();

        Student s5 = new Student("张四","005");
        Student s6 = new Student("李四","006");
        Student s7 = new Student("王四","007");
        Student s8 = new Student("赵四","008");

        array2.add(s5);
        array2.add(s6);
        array2.add(s7);
        array2.add(s8);
        map.put(s5.getName(),array2);

        for (String s:map.keySet()) {
            System.out.println("组长名字为:"+s);
            ArrayList<Student> arrayList = map.get(s);
            for(Student stu:arrayList){
                System.out.println("学员名字:"+stu.getName()+"\t学号是:"+stu.getId());
            }
        }
        System.out.println("请输入学员姓名:");
        String stuName = new Scanner(System.in).nextLine();

        for (String ss:map.keySet()) {
            ArrayList<Student> arrayList = map.get(ss);
            for(Student stu:arrayList){
               if(stuName.equals(stu.getName())){
                   System.out.println("确有此人");
               }else{
                   System.out.println("查无此人");
               }
            }
        }
    }
}
