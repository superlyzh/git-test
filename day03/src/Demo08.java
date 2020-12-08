public class Demo08 {
    public static void main(String[] args) {
        Float thickness = 0.1f;
        Float height = 8844430F;
        int count = 0;
        while(thickness <= height){
            thickness*=2;
            count++;
        }
        System.out.println("一共折叠了"+count+"次");

    }
}
