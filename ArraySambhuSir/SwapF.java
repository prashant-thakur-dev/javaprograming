package src.ArraySambhuSir;

public class SwapF {
    public static int[] swapFun(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
