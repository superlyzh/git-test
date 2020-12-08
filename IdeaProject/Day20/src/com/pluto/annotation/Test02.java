package com.pluto.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test02 {

    @MyAnnotation(name = "小华")
    public void test02(){
        System.out.println("j");
    }

    @Target(value = {ElementType.METHOD,ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
     @interface MyAnnotation{
         String name();
         int age() default 0;
         int id () default -1;
         String[] schools() default {"pluto","小华"};
     }
}
