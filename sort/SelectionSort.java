package src.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
        int[] res = selectionSort(arr);
        for(int r:res){
            System.out.println(r);
        }
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = arr[i]; int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        return arr;
    }
}
