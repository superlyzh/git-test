import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            System.out.println("请输入第"+(i+1)+"个组员的姓名");
            str[i] = new Scanner(System.in).next();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println("第"+(i+1)+"个组员的姓名是:"+ str[i]);
        }
    }
}
