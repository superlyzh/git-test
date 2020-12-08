package com.pluto;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {23,1,4,66,14};

       int sum = sum(arr);
       double avg = avg(arr,sum(arr));
       int oushu = oushu(arr);
        System.out.println("和:"+sum);
        System.out.println("平均值:"+avg);
        System.out.println("oushu:"+oushu);
    }

    private static int oushu(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
         sum += arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr,int sum){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=i;
            num ++;
        }
        return sum/num;
    }
}
