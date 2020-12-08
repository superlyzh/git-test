package homework;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int desc = 9;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(desc == arr[i]){
                flag = false;
                System.out.println("找到了,索引为:"+i);
            }
        }
        if (flag){
            System.out.println("抱歉,没有找到!");
        }

    }
}
