package homework;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩:");
        if(new Scanner(System.in).nextInt() >= 60){
            System.out.println("合格");
        }
        else{
            System.out.println("不合格");
        }
    }
}
