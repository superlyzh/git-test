package com.pluto.abstarct.test;

public class Animal implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void breathe() {
        System.out.println("吸入氧气呼出二氧化碳");
    }

    @Override
    public void sleep() {
        System.out.println("闭上眼睛睡觉");
    }
}
