public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {12,12,35,6,45,89,78,87};



        for(int i = 0;i < arr.length-1;i++){
            for (int j = i+1;j < arr.length;j++) {
                if(arr[i] > arr[j]){
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
