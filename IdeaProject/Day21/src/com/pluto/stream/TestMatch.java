package com.pluto.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class TestMatch {
    public static void main(String[] args) {
        System.out.println(Stream.of(5, 6, 7, 8, 9).anyMatch(i -> i > 7));
        System.out.println(Stream.of(5, 6, 7, 8, 9).allMatch(i -> i > 7));
        System.out.println(Stream.of(5, 6, 7, 8, 9).noneMatch(i -> i > 7));
        Optional<Integer> any = Stream.of(5, 6, 7, 8, 9).findAny();
        System.out.println(any.get());
        System.out.println(Stream.of(5, 6, 7, 8, 9).findFirst().get());
        System.out.println(Stream.of(5, 6, 11, 8, 9).max((o1, o2) -> o1 - o2).get());
        System.out.println(Stream.of(5, 6, 11, 8, 9).min((o1, o2) -> o1 - o2).get());
    }
}
