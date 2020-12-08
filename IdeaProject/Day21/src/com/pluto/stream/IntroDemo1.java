package com.pluto.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class IntroDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        for (String s : list) {
            if(s.startsWith("张")){
                if(s.length()==3){
                    System.out.println(s);
                }
            }
        }
        Stream<String> string = Stream.of("String");
       // System.out.println(string.count());
        Stream<String> limit = string.limit(1);
        System.out.println(string);
        System.out.println(limit);

        list.stream().filter(s -> s.startsWith("张"))
                .filter(s-> s.length() == 3)
                .forEach(s-> System.out.println(s));
    }

}
