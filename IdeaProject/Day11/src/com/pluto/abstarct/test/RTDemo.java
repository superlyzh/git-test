package com.pluto.abstarct.test;

public class RTDemo {
    public static void main(String[] args) {
        Runner r = new Rabbit();
        r.run();
        r = new Tortoise();
        Tortoise t = (Tortoise)r;
        t.run();
        t.swim();
        ((Swimming) () -> System.out.println("狗刨式游泳")).swim();
    }
}
