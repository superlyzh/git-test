package com.pluto.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        List<String> one = new ArrayList<String>();
        Collections.addAll(one,"迪丽热巴","宋远桥","苏星河","老子","庄子","孙子");
//        one.stream().forEach(System.out::println);
//        System.out.println(one.stream().count());
//
//        one.stream().filter(s -> s.length() == 3).forEach(System.out::println);
//        one.stream().limit(3).forEach(System.out::println);
        one.stream().skip(2).forEach(System.out::println);


    }

}
