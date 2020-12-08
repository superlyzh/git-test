public class Demo01 {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;

        //后自增
        int c = i++;
        //c = 3, i = 4;

        //前自增
        int d  = ++j;
        // d = 5, j = 5;
        System.out.println("c =" + c);
        System.out.println("d =" + d);

        //后自增运算
        int e = i + j++;
        // e = 9, i = 4, j = 6;

        //前自增运算
        int f  = i + ++j;
        //f = 11, i = 4, j =7

        System.out.println("e = " + e);
        System.out.println("f = " + f);

    }
}
