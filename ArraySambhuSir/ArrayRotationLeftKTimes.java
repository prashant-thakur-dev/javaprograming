package src.ArraySambhuSir;
// right rotate
public class ArrayRotationLeftKTimes {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int[] ans = rotateKTimes(arr, 3);
        for(int x:ans){
            System.out.println(x);
        }
    }

    private static int[] rotateKTimes(int[] arr, int k) {
        k = k% arr.length;
        if (k==0){
            return arr;
        }
        reverseFuntion(arr, 0, k-1);
        reverseFuntion(arr, k, arr.length-1);
        reverseFuntion(arr, 0, arr.length-1);

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
