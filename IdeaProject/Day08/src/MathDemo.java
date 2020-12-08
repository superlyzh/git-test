import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100+1);
        //System.out.println(random);



        while(true){
            Scanner sc = new Scanner(System.in);
            int guessNum = sc.nextInt();
            if(guessNum > random){
                System.out.println("你猜的"+guessNum+"太大了");
            }else if(guessNum < random){
                System.out.println("你猜的"+guessNum+"太小了");
            }else{
                System.out.println("恭喜你,猜中了");
                break;
            }
        }

    }
}
