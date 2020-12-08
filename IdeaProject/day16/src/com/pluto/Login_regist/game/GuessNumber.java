package com.pluto.Login_regist.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void guessNumberGame(){
        System.out.println("欢迎来到猜数字小游戏");
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100)+1;
        while(true) {
            System.out.println("请输入你猜的数(1-100)");
            int guessNumber = sc.nextInt();
            if(guessNumber > randomNumber){
                System.out.println("你猜的数大了");
            }else if (guessNumber < randomNumber){
                System.out.println("你猜的数小了");
            }else{
                System.out.println("恭喜，猜中了");
                break;
            }
        }
    }
}
