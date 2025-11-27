package src.ArraySambhuSir;
// right rotate
public class ArrayRotationRightKTimes {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int[] ans = rotateKTimes(arr, 3);
        for(int x:ans){
            System.out.println(x);
        }
    }

    private static int[] rotateKTimes(int[] arr, int k) {
        reverseFuntion(arr, 0, arr.length-1);
        reverseFuntion(arr, 0, k-1);
        reverseFuntion(arr, k, arr.length-1);
        return arr;
    }
    private static void reverseFuntion(int[] arr, int s, int e) {
        while (s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }

}
