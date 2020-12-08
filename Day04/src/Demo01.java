import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("请输入一个大于1的整数");
        int num = new Scanner(System.in).nextInt();

        if(num > 2){
            if(num%2 == 0){
                System.out.println(num+"不是质数");
                return;
            }
            for (int i = 2; i < num ; i++) {
                if(num%i == 0){
                    System.out.println(num+"不是质数");
                    break;
                }else{
                    System.out.println(num+"是质数");
                    break;
                }
            }
        }else if(num == 2){
            System.out.println(num + "是质数");
        }
        else{
            System.out.println("输入有误!");
        }
    }
}
