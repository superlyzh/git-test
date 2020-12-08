public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,4,2};
        int index = leftSumEqualsRightSum(arr);
        if(index!=-1) {
            System.out.println(arr[index]);
        }else {
            System.out.println("没有");
        }
    }
    public static int leftSumEqualsRightSum(int[] arr) {
        for (int mid = 0; mid < arr.length; mid++) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i <mid; i++) {
            leftSum += arr[i];
        }
        for (int i = mid+1; i < arr.length; i++) { rightSum += arr[i];
        }
        if(leftSum==rightSum) {
            return mid;
        }
    }
        return -1;
    }
}
