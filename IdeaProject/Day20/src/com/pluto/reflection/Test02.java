package com.pluto.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class name = Class.forName("com.pluto.reflection.Person");
        System.out.println(name);

        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Person p = new Person();
        Class cls = p.getClass();
        System.out.println(cls);

        System.out.println(personClass == name);
        System.out.println(cls == name);
        System.out.println(personClass == cls);
    }
}
