package com.pluto.reflection;

import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        //public
//        Field[] fields = personClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        //通过变量名获取(public)/获取值/设置值
        Field a = personClass.getField("a");
        Person p = new Person();
        System.out.println(a.get(p));
        a.set(p,"pluto");
        System.out.println(a.get(p));

        //所有
//        Field[] declaredFields = personClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField);
//        }

        //通过变量名获取(所有权限)
        Field age = personClass.getDeclaredField("age");
        //暴力反射，忽略安全修饰符的安全检查
        age.setAccessible(true);
        Object o1 = age.get(p);
        System.out.println(o1);
        age.set(p,22);
        Object o = age.get(p);
        System.out.println(o);

    }
}
