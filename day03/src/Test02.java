import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();

        System.out.println("三个数中的最大值为:"+(a>b?(a>c?a:c):(b>c?b:c)));
    }
}
