public class Demo05 {
    public static void main(String[] args) {
        int a = 99;
        int b = 54;
        int c = 75;

        if(a > b) {
            if (a > c) {
                System.out.println("最大值为:" + a);
            }
        }
            else if(b > c){
                System.out.println("最大值为:"+b);
            }
            else{
                System.out.println("最大值为:"+c);
            }
        }
    }

