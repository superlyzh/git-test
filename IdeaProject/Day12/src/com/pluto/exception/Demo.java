package com.pluto.exception;
/*
异常:程序运行过程中出现的非正常情况，如果不处理，会导致jvm终止.
    程序当中如何描述异常?
        Java把各种异常定义成了不同类来进行描述。
    程序出现了异常的话，我们如何得知？
        Java会创建出对应的异常对象,并抛出了(throw)。
    发现了异常,如何处理?
    异常体系:
        Throwable根类
            Error：严重错误，无法处理，只能终止程序.
            Exception:一般性问题，可以预防并处理，可以保证程序发生异常时，还能正常运行.
 */

public class Demo {
    public static void main(String[] args) {
        System.out.println(10/20);
    }
}
