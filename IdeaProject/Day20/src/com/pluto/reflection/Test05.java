package com.pluto.reflection;

import java.lang.reflect.Method;

public class Test05 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Person p = new Person();
        Method eat = personClass.getMethod("eat");
        eat.invoke(p);

        personClass.getMethod("eat",String.class).invoke(p,"米粉");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }
    }
}
