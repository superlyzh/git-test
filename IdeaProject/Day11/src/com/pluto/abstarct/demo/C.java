package com.pluto.abstarct.demo;

public class C implements A,B{
    @Override
    public void eat() {
        System.out.println("吃米饭");
    }

    @Override
    public void playGame() {
        System.out.println("玩游戏");
    }

    public static void main(String[] args) {
        A a = new C();
        a.eat();
        a.playGame();
        B b = new C();
        b.eat();
        b.playGame();;
    }
}
