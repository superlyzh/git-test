package com.pluto.Demo;

/**
 * 单例设计模式
 */

public class SingleDemo {
    public static void main(String[] args) {
            Single s1 = Single.getInnstance();
            Single s2 = Single.getInnstance();
        System.out.println(s1 == s2);
    }

}
