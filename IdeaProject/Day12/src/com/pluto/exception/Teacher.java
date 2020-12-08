package com.pluto.exception;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩:");
        int score = sc.nextInt();

        try {
            check(score);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    public static void check(int score) throws MyException {
        if(score > 100||score < 0){
            throw new MyException("分数必须在0-100之间");
        }
        else{
            System.out.println("分数没有问题");
        }
    }
}
