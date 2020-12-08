package com.pluto.lambda;

import java.util.function.Function;

public class FunctionAndThen {
    public static void main(String[] args) {
            getNumber((String str)->{
                int i = Integer.parseInt(str);
                return  i;
            },(Integer i)->{
                return i<<3;
            });
    }

    public static void getNumber(Function<String,Integer> f1,Function<Integer,Integer> f2){
//        Integer numl = f1.apply("10");
//        System.out.println(numl);
//        Integer numb = f2.apply(numl);
//        System.out.println(numb);
        Integer apply = f1.andThen(f2).apply("10");
        System.out.println(apply);
    }
}
