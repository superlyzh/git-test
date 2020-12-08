package com.pluto.object.integer;

public class IntegerDemo4 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1.equals(i2));

        //直接赋值，数据缓存池-128到127之间，在该范围之间，直接从缓冲池获取
        Integer i3 = 128;
        Integer i4 = 128;
       // System.out.println(i3 == i4);
    }
}
