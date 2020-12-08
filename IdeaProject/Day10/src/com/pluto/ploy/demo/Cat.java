package com.pluto.ploy.demo;

public class Cat extends  Animal{
    public Cat(){
        this(2);

    }
    public Cat(int a){
        super("hello");
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
