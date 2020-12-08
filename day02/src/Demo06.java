public class Demo06 {
    public static void main(String[] args) {
        int a  = 3, b = 32, c = 5;

        int max = (a > b)?(a > c ? a : c):( b > c ? b : c);
        boolean bool = true^false;

        System.out.println(bool);
        System.out.println(max);


    }
}
