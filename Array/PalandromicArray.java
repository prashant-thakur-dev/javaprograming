package src.Array;

public class PalandromicArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,1};
        int s = 0;
        int e = arr.length-1;
        boolean ans = isPalandromicArray(arr,s,e);
        System.out.println(ans);
    }

    private static boolean isPalandromicArray(int[] arr, int s, int e) {
        while (s<e){
            if(arr[s] != arr[e]){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
