import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        String[] week = {"Monday","Tuesday","Wenday","Thirsday","Friday","Satday","Sunday"};

        System.out.println("请输入一个1-7的整数:");
        int day = new Scanner(System.in).nextInt();
        for (int i = 0; i < week.length; i++) {
            if((i+1) == day){
                System.out.println(week[i]);
            }
        }
    }
}
