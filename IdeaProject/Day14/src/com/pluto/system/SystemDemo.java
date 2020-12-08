package com.pluto.system;

public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("hello"+i);
        }
        long end  = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");
    }
}

