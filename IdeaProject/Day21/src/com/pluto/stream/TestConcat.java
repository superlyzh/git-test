package com.pluto.stream;

import java.util.stream.Stream;

public class TestConcat {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("张三");
        Stream<String> streamB = Stream.of("李四");
        Stream.concat(streamA,streamB).forEach(System.out::println);
    }
}
