package src.Searching;
/*
if the given array is unsorted then we have t check or search each element one by one which is called leaner search.

 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9,2,7,8,3,4,6,1,5};
        int k = 5;
        int val = linearSearch(arr, k);
        if (val >= 0) {
            System.out.println("value at index: "+ val);
        }
        else {
            System.out.println("value is not present");
        }
    }

    private static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
