package com.pluto.lambda;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        isLongName((str)-> str.length() > 3);
    }

    public  static void isLongName(Predicate<String> p){
        String str = "古力娜扎";
        boolean test = p.test(str);
        if(test){
            System.out.println("名字长");
        }else{
            System.out.println("刚刚好");
        }
    }

}
