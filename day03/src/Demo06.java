import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个年份:");
        int year = sc.nextInt();

        System.out.println("请输入一个月份:");
        int month = sc.nextInt();
        int days = 0;

        if(year < 0){
            System.out.println("年份不正确");
        }else{
            if(month < 1&& month >12) {
                System.out.println("月份不正确");
            }else{
                if(month == 1||month ==3||month == 5||month == 7||month == 8||month == 10||month == 12){
                    days = 31;
                }else if(month == 4|| month == 6|| month == 9|| month == 11){
                    days = 30;
                }else{
                    if(year%4 == 0&& year%100 !=0||year%400 == 0 ){
                        days = 29;
                    }else{
                        days = 28;
                    }
                }
            }
            }
        System.out.println(year+"年"+month+"月"+"共有"+days+"天");
        }

    }

