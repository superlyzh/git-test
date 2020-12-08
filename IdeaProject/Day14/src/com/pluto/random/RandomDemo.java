package com.pluto.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r  =new Random(1111);

        for (int i = 0; i < 20; i++) {
            System.out.println(r.nextInt(100)+1);
        }
    }
}
