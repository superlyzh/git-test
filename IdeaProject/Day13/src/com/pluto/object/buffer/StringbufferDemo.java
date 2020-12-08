package com.pluto.object.buffer;

public class StringbufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //返回字符串缓冲区本身
        StringBuffer sb2 = sb.append("hello");

        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);

        sb.append("world").append("java").append("EE");
        System.out.println(sb);

        sb.insert(5,"world1");
        System.out.println(sb);

        sb.deleteCharAt(10);
        System.out.println(sb);

        sb.delete(5,10);
        System.out.println(sb);

//        sb.delete(0,sb.length());
//        System.out.println(sb);

//        sb.replace(5,10,"节日快乐hdjsh");
//        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);

//        String substring = sb.substring(5);
//        System.out.println(substring);
//        System.out.println(sb);

        String substring2 = sb.substring(5,10);
        System.out.println(substring2);
    }
}
