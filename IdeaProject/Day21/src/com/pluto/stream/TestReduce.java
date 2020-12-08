package com.pluto.stream;

import java.util.stream.Stream;

public class TestReduce {
    public static void main(String[] args) {
        System.out.println(Stream.of(4, 5, 3, 9).reduce(0, (x, y) -> x + y));

        System.out.println(Stream.of(4, 5, 3, 9).reduce(0, (x, y) -> x > y ? x : y));
    }
}
