package src.ArraySambhuSir;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swapFun(arr, start, end);
            start++;
            end--;
        }
        for (int a : arr){
            System.out.print(a+" ");
        }
    }

    public static void swapFun(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
