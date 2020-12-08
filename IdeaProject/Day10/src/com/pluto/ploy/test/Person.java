package com.pluto.ploy.test;

public class Person {
    public void toilet(){
        System.out.println("~~~~");
    }
}
class Man extends  Person{
    @Override
    public void toilet() {
        System.out.println("Male");
    }
}
class Woman extends Person{
    @Override
    public void toilet() {
        System.out.println("Female");
    }
}