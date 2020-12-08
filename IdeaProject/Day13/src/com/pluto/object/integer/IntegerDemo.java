package com.pluto.object.integer;

public class IntegerDemo {
    //自动拆装箱
    public static void main(String[] args) {
        Integer i1 = 100;
        if(i1 != null) {
            i1 += 200;
            System.out.println(i1);
        }
    }
}
