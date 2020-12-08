package com.pluto.stream;

import java.util.stream.Stream;

public class TestMapReduce {
    public static void main(String[] args) {
        System.out.println(Stream.of(
                new Person("刘德华", 58),
                new Person("张学友", 56),
                new Person("郭富城", 54),
                new Person("黎明", 52)
        ).map((p) -> p.getAge()).reduce(0, (x, y) -> x > y ? x : y));

        System.out.println(Stream.of(
                new Person("刘德华", 58),
                new Person("张学友", 56),
                new Person("郭富城", 54),
                new Person("黎明", 52)
        ).map((p) -> p.getAge()).reduce(0, Math::max));

        System.out.println(Stream.of("a", "c", "b", "a", "b", "a")
                .map(s -> s == "a" ? 1 : 0).reduce(0, Integer::sum));
        System.out.println(Stream.of("a", "c", "b", "a", "b", "a")
                .filter(s -> s == "a").count());
    }
}
