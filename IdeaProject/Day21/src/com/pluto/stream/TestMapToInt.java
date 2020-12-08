package com.pluto.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMapToInt {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6});
        IntStream intStream = stream.mapToInt(Integer::intValue);
        intStream.filter(n -> n > 3).forEach(System.out::println);
    }
}
