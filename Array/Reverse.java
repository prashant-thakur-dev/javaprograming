package src.Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9};
        reverseArr(arr, 0, arr.length - 1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void reverseArr(int[] arr, int s, int e){
        while (s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

}
