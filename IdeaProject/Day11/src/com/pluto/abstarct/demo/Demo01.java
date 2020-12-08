package com.pluto.abstarct.demo;

public class Demo01 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a = new Dog();
        a.eat();
        a.test();

        Danceable d  = new Dog();
        d.dance();
        d  = new Cat();
        d.dance();
    }
}
