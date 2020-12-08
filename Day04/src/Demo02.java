import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        double balance = 0.0;
        int choose = 0;
        do{
        System.out.println("------ATM---------");
        System.out.println("1:存款");
        System.out.println("2:取款");
        System.out.println("3:显示余额");
        System.out.println("4:退出");
        System.out.println("------请选择----------");

        choose = new Scanner(System.in).nextInt();

        switch (choose) {
            case 1:
                System.out.println("-------存款界面-----------");
                System.out.println("请输入你的存款金额:");
                balance += new Scanner(System.in).nextDouble();
                break;
            case 2:
                System.out.println("-------取款界面-----------");
                break;
            case 3:
                System.out.println("-------余额界面-----------");
                System.out.println("你的余额为:" + balance);
                break;
            case 4:
                System.out.println("-------退出界面-----------");
                break;
            default:
                System.out.println("选择错误");
                break;
        }
        }while(choose == 4);
    }
}
