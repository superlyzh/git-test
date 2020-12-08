public class Test01 {
    public static void main(String[] args) {
        char[] chs = new char[26];
        int j = 0;
        for (int i = 97; i < 123; i++) {
            chs[j] = (char)i;
            j++;
        }
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]+"->"+(char)(chs[i]-32)+"\u0000");
        }
    }
}
