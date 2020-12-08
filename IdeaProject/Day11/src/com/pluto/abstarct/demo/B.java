package com.pluto.abstarct.demo;

public interface B {
    void eat();
    default void playGame(){
        System.out.println("哈哈");
    }
}
