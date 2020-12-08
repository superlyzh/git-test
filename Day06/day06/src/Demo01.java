public class Demo01 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        printArray(arr);

    }
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if(j!=arr[i].length-1) {
                    System.out.print(arr[i][j] + ",");
                }else{
                    System.out.print(arr[i][j]+"]");
                }
            }
            System.out.println();
        }
    }
}
