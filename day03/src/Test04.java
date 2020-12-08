import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的姓名:");
        String name = sc.next();

        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();

        System.out.println("请输入你的性别:");
        char gender = sc.next().charAt(0);

        System.out.println("请输入你的体重:");
        double weight = sc.nextDouble();

        System.out.println("请输入你的简介:");
        String profile = sc.next();

        System.out.println("姓名:" + name + ",年龄" + age + ",性别" +
                gender+",体重" + weight + ",简介:" + profile);
    }
}
