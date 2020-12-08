package com.pluto.abstarct.test;

public class Tortoise implements Runner, Swimming{
    @Override
    public void swim() {
        System.out.println("乌龟游泳");

    }

    @Override
    public void run() {
        System.out.println("乌龟爬");
    }
}
