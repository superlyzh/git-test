package com.pluto.abstarct.demo;

public class Cat extends Animal implements Danceable {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void dance() {
        System.out.println("猫跳舞");
    }
}
