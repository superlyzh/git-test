import java.util.Scanner;

public class homeWork02 {
    public static void main(String[] args) {
        System.out.print("请输入月份:");
        int month = new Scanner(System.in).nextInt();
        System.out.print("请输入日期:");
        int days = new Scanner(System.in).nextInt();
        if (month > 1 && month < 12) {
            if(month == 2){
                days += 31;
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                days = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            }
        }
    }
 }
