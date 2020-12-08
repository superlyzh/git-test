package com.pluto.object.character;

public class ChacterDemo {
    public static void main(String[] args) {
        Character ch = new Character('a');
        System.out.println(ch);

        //判断大写
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('0'));

        //判断小写
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('0'));

        //判断数字
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('0'));

        //转大写
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase('A'));

        //转小写
        System.out.println(Character.toLowerCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
