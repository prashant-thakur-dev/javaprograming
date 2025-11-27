package src.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        int[] res = insertionSort(arr);
        for(int r:res){
            System.out.println(r);
        }
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
