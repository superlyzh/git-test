import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("请输入第一个值:");
        int x = sc.nextInt();
        System.out.println("请输入第二个值:");
        int y = sc.nextInt();

        System.out.println("两个数的和为："+(x+y));
    }
}
