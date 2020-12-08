public class Demo04 {
    public static void main(String[] args) {
        int i = 4;
        int j = 5;
        int k = 6;

        System.out.println((i>j)&(i<k));
        System.out.println((i>j)|(i<k));
        System.out.println((i>j)^(j>k));
        System.out.println((i<j)^(j>k));


        System.out.println((i>j)&&(i<k));
        System.out.println((i>j)||(i<k));

    }
}
