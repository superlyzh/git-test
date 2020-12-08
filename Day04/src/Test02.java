import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个组员的年龄");
            arr[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"个组员的年龄是:"+ arr[i]);
        }
    }
}
