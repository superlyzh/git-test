package com.pluto.object.demo;

public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student("林青霞",27);
        Student s2 = new Student();
        s2.setName("风清扬");
        s2.setAge(30);

        Object obj = s.clone();
        Student s3 = null;
        if( obj instanceof Student){
            s3 = (Student)obj;
        }

        System.out.println(s.hashCode());
        System.out.println(s2.equals(s3));
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s3));


        System.out.println(s.getClass());
        System.out.println(s2.getClass());
        System.out.println(s3.getName()+"---"+s3.getAge());
        System.out.println(s.toString());
        System.out.println(s2.toString());
    }
}
