
public class ArrayTooTest {
    //测试数组工具类
    public static void main(String[] args) {
        int[] arr = {12,33,432,324,432,44,32,54,654,324,213,234,23};

        int max = ArrayTool.getMax(arr);
        System.out.println("最大数为:"+max);
        int index = ArrayTool.getIndex(arr, 32);
        System.out.println("索引为:"+index);
        ArrayTool.printArray(arr);
        ArrayTool.sort(arr);
        ArrayTool.printArray(arr);
        ArrayTool.selectSorts(arr);
        ArrayTool.printArray(arr);
    }
}
