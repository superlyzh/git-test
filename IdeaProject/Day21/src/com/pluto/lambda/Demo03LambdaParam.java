package com.pluto.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03LambdaParam {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("刘德华",58,174));
        persons.add(new Person("张学友",58,176));
        persons.add(new Person("郭富城",54,173));
        persons.add(new Person("黎明",53,177));

        Collections.sort(persons,(p1,p2)-> p1.getAge() - p2.getAge());
        persons.forEach(t -> System.out.println(t));
    }
}
