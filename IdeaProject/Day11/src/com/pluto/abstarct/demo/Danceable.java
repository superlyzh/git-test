package com.pluto.abstarct.demo;

/**
 * 关键字interface 定义接口
 * 接口的成员:
 * 静态常量
 * 抽象方法
 * 缺省方法/扩展方法
 * 静态方法(通常定义工具类中的方法,服务于接口的实现类（jdk1.8）)
 * 私有方法(jdk1.9(提取通用代码块))
 */

public interface Danceable {
    /**
     * 常量，默认自带public static final
     */

    public static final int a = 0;
    //抽象方法，默认自带public abstract
    public void dance();
    default void test(){//扩展方法,默认自带public,实现类可实现可不实现
        System.out.println("default");
    }
    static void testStatic(){

    }
}
