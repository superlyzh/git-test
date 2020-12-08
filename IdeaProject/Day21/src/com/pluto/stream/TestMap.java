package com.pluto.stream;

import java.util.stream.Stream;

public class TestMap {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("11", "22", "33");
//        stream.map(s->Integer.parseInt(s)).forEach(System.out::println);
//        Stream.of("11", "22", "33").map(Integer::parseInt).forEach(System.out::println);
//        Stream.of(33,22,11,55,77,66).sorted(((o1, o2) -> o2 -o1)).forEach(System.out::println);
//        Stream.of(22,33,22,11,33).distinct().forEach(System.out::println);
//        Stream.of("bb","cc","bb","aa","cc").distinct().forEach(System.out::println);
        Person p1 = new Person("张三",20);
        Person p2 = new Person("李四",20);
        Person p3 = new Person("王五",20);
        Person p4 = new Person("张三",20);
        Person p5 = new Person("王五",20);
        Stream.of(p1,p2,p3,p4,p5).distinct().forEach(System.out::println);
    }
}
