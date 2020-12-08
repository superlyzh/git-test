import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("请输入年份:");
        int year = new Scanner(System.in).nextInt();
        System.out.println("请输入月份:");
        int month = new Scanner(System.in).nextInt();
        System.out.println("请输入日份:");
        int day = new Scanner(System.in).nextInt();
        int sum = day;

        for (int i = 1; i < month ; i++) {
            sum += days[i];
        }

        if(month>2){
            if(year % 4 == 0&&year%100 != 0 || year % 400 ==0){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
