package homework;


import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入考试成绩:");
        int score = new Scanner(System.in).nextInt();
        if(score >= 60&&score <=100){
            if(score == 100){
                System.out.println("恭喜,获得BMW一辆");
            }else if(score > 80&&score <= 99){
                System.out.println("恭喜,获得iphone7plus一台");
            }else{
                System.out.println("恭喜,获得ipad一台");
            }
        }else{
            System.out.println("好好学习,天天向上");
        }
    }
}
