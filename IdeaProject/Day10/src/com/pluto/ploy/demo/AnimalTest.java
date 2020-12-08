package com.pluto.ploy.demo;

public class AnimalTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.feed(new Dog());
        p.feed(new Cat());

        Animal a = new Dog();
        a.eat();
        a.sleep();
    }
}
