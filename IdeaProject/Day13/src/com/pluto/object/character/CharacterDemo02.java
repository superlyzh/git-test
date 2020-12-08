package com.pluto.object.character;

import java.util.Scanner;

public class CharacterDemo02 {
    public static void main(String[] args) {
        //String str = "HelloWorld123";
        System.out.println("请输入一个字符串:");
        char[] chs = new Scanner(System.in).nextLine().toCharArray();
        int upCase = 0;
        int lowerCase = 0;
        int num = 0;

        for (int i = 0; i < chs.length; i++) {
            if(Character.isUpperCase(chs[i])){
                upCase++;
            }else if(Character.isLowerCase(chs[i])){
                lowerCase++;
            }else if(Character.isDigit(chs[i])){
                num++;
            }
        }
        System.out.println("一共"+upCase+"个大写字母，"+lowerCase+"个小写字母,"+num+"个数字");
    }
}
