import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("请输入一个年份:");
        int year = sc.nextInt();

        if((year%4 == 0&& year%100 != 0) || (year%400 == 0)){
            System.out.println("二月有二十九天");
        }else{
            System.out.println("二月有二十八天");
        }
    }
}
