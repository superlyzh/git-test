package com.pluto.abstarct.demo;

public class Dog extends Animal  implements Danceable {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void dance() {
        System.out.println("狗跳舞");
    }
}
