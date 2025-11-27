package src.Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {82,81,43,50,38,63,58,80};
        int res = secondLargest(arr);
        System.out.println(res);
    }

    private static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
