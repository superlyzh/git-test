public class Test01 {
    public static void main(String[] args) {

        byte b = 12;
        short s = 34;
        char c  = 38;
        int i = 64;
        long l  = 378;
        float f  = 12.34f;
        double d  = 34.56;

        float result = (float)(b + s + c + i + l + f + d);

        System.out.println(result);
    }
}
