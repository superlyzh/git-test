package com.pluto.lambda;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        printHello((String str)->{
            System.out.println(str.toUpperCase());
        },(String str) ->{
            System.out.println(str.toLowerCase());
        });

    }
    public static void printHello(Consumer<String> c1,Consumer<String> c2){
        String str = "Hello World";
        c1.accept(str);
        c2.accept(str);

    }
}
