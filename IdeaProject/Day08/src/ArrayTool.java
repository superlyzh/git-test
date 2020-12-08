/**
 * 这是针对数组进行操作的工具类
 * @author pluto
 * @version 1.0
 */
public class ArrayTool {
    //禁止创建对象

    /**
     * 这是私有构造
     */
    private ArrayTool(){}

    /**
     * 这是遍历数组的方法,遍历后的格式为:[元素1...元素n]
     * @param arr 要遍历的数组
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                System.out.print(arr[i]+",");
            }else {
                System.out.println(arr[i]+"]");
            }
        }
    }

    /**
     * 这是获取数组中最大值的方法
     * @param arr 要获取最大值的数组
     * @return 返回数组中的最大值
     */
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    /**
     *这是获取指定元素在数组中第一次出现的索引,如果元素不存在,返回-1
     * @param arr 被查找的数组
     * @param value 要查找的元素
     * @return 返回元素在数组中的索引,如果没有,返回-1
     */
    public static int getIndex(int[] arr,int value){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 从大到小排序
     * @param arr 要排序的数组
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 从小到达的排序
     * @param arr  要排序的数组
     */
    public static  void selectSorts(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
