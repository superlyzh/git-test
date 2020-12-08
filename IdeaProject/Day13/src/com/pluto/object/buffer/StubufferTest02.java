package com.pluto.object.buffer;
/*
String 和StringBuffer的相互转换
 */
public class StubufferTest02 {
    public static void main(String[] args) {
        String s  ="hello";

        //转字符串缓冲区
        StringBuffer sb =new StringBuffer(s);
        StringBuffer append = sb.append(sb);

        //转字符串
        String str = new String(append);
        String s1 = sb.toString();

    }

}
