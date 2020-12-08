package com.pluto.lambda;

import org.junit.Test;

import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo02 {
    public static void main(String[] args) {
        decidStr((str)-> str.contains("H")&&str.contains("W")
        ,(str)->str.contains("H")||str.contains("W"),(str)->!str.contains("W"));

    }
    public static void decidStr(Predicate<String> p1,Predicate<String> p2,Predicate<String> p3){
        String str = "HelloWorld";
        boolean t1 = p1.test(str);
        System.out.println("是否包含H和W:" + t1);
        boolean t2 = p2.test(str);
        System.out.println("是否包含H或W:" + t2);
        boolean t3 = p3.test(str);
        System.out.println("是否不包含W:" + t3);


        }
        @Test
    public void test01(){
        Date now = new Date();
            Supplier<Long> supp = () -> now.getTime();
            System.out.println(supp.get());
            Supplier<Long> supp2 = now::getTime;
            System.out.println(supp2.get());
        }
        @Test
    public void test02(){
        Supplier<Long> supp = ()->System.currentTimeMillis();
            System.out.println(supp.get());

            Supplier<Long> supp2 = System::currentTimeMillis;
            System.out.println(supp2.get());
        }
        @Test
    public void test03(){
            Function<String,Integer> f1 = (s) -> s.length();
            System.out.println(f1.apply("helloworld"));

            Function<String,Integer> f2 = String :: length;
            System.out.println(f2.apply("hello"));

            BiFunction<String,Integer,String> bif = String::substring;
            System.out.println(bif.apply("hello", 2));
        }
        @Test
    public void test04(){
        Supplier<Person> sup = () -> new Person();
            System.out.println(sup.get());

            Supplier<Person> sup2 = Person::new;
            System.out.println(sup2.get());

            BiFunction<String,Integer,Person> bif = Person::new;
            Person person = bif.apply("张三", 20);
            System.out.println(person);
        }
        @Test
    public void test05(){
        Function<Integer,String[]> fun = len -> new String[len];
            String[] arr = fun.apply(5);
            System.out.println("arr:" + arr.length);

            Function<Integer,String[]> fun2 = String[]::new;
            String[] arr2 = fun2.apply(7);
            System.out.println("arr2:" + arr2.length);
        }
}
