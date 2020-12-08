import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        double random = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int guessnum = 0;
        do {
            System.out.println("请输入你猜的数");
            num = sc.nextInt();
            if(num > random){
                System.out.println("输入的数太大了");
            }
            if(num < random){
                System.out.println("输入的数太小了");
            }
            guessnum++;
        }while(random != num);
        System.out.println("恭喜你,猜中了,一共猜了"+guessnum+"次");
    }
}
