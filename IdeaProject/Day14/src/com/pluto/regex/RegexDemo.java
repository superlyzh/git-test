package com.pluto.regex;

import java.util.Scanner;

public class RegexDemo {
    public static void main(String[] args) {
        System.out.println("请输入你的QQ号码:");
        System.out.println(checkQQ(new Scanner(System.in).nextLine()));
    }

    public static  boolean checkQQ(String qq){
        boolean flag = true;
        //校验长度
        if(qq.length() >= 5 && qq.length() <= 15){
            //不能以0开头
            if(!qq.startsWith("0")){
                //必须是数字
                char[] chs = qq.toCharArray();
                for (int i = 0; i < chs.length; i++) {
                    if(!Character.isDigit(chs[i])){
                            flag = false;
                            break;
                    }
                }
            }else {
                flag = false;
            }
            }else{
                flag = false;
        }

        return flag;
    }
}
