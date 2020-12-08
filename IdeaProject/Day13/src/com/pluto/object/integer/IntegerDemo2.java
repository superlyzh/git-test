package com.pluto.object.integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer j = new Integer("1010");

        System.out.println(i);
        System.out.println(j);

        //int---String
        int number = 100;

        String s1 = "" + number;
        String s2 = String.valueOf(number);
        String s3 = Integer.toString(number);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int i2 = new Integer(s2).intValue();
        int i3 = Integer.parseInt(s3);
        System.out.println(i2);
        System.out.println(i3);



    }


}
