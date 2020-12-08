public class Demo02 {
    public static void main(String[] args) {
        int num  = 1234;

        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100%10;
        int qian = num/1000;

        System.out.println(num+"这个四位数个位上的数字是"+ge);
        System.out.println(num+"这个四位数十位上的数字是"+shi);
        System.out.println(num+"这个四位数百位上的数字是"+bai);
        System.out.println(num+"这个四位数千位上的数字是"+qian);


    }
}
