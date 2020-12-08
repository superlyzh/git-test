package com.pluto.abstarct.demo;

public interface A {
     void eat();
     default void playGame(){
         System.out.println("哈哈");
     }
}
