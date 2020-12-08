package com.pluto.annotation;

public class Test01 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public static  void test(){
        System.out.println("Deprecated");
    }

    public static void main(String[] args) {
        test();
    }
}
