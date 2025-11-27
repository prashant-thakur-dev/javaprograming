package src.Array;

public class KthLargestOn {
    public static void main(String[] args) {
        int[] arr = {7,8,6,6,5,7,10,10,7,7,5,6,8};
        int k = 5;
        kthLargestOn(arr,k);
    }

    private static void kthLargestOn(int[] arr, int k) {
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = arr[n-1];
                    n--;
                    j--;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
