package com.pluto.object.buffer;
/*线程安全
安全--同步--数据是安全的
不安全--不同步--效率高

StringBuffer:线程安全的可变字符串

StringBuiffer和String的区别?
前者长度和内容可变，后者不可变。
如果使用前者的字符串拼接，不会浪费太多的资源
 */

public class StringBufferTest {
    public static void main(String[] args) {
        java.lang.StringBuffer sb = new java.lang.StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("-------------");

        java.lang.StringBuffer  sb2 = new java.lang.StringBuffer(50);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println("-------------");

        java.lang.StringBuffer sb3 = new java.lang.StringBuffer("hello");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

    }
}
