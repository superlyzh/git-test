package com.pluto.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test04 {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;

        //
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person person = constructor.newInstance("张三", 22);
        System.out.println(person);


        Person person1 = personClass.newInstance();
        System.out.println(person1);

        constructor.setAccessible(true);
    }
}
