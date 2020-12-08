package com.pluto.abstarct.test;

public class LiveAbleDemo {
    public static void main(String[] args) {
        LiveAble la = new Animal();
        la.eat();
        la.breathe();
        la.sleep();
        LiveAble.drink();
        System.out.println("-------------");
        la = new Plant();
        la.eat();
        la.breathe();
        la.sleep();
        LiveAble.drink();
    }
}
