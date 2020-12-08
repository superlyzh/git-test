public class Demo03 {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        //j = 1, i = 2;
        int k = i++ * ++j + ++i * j++;
        // K = 2 * 2 + 4 * 2
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
