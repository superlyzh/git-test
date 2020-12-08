public class Test07 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5},{7,8,9}};
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1][1]);

        int [][] arr2 = new int[3][2];
        arr2[0][0] = 2;
        arr2[0][1] = 2;
        arr2[0][1] = 2;
        System.out.println(arr2[0][1]);
    }
}
