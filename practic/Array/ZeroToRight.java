package src.practic.Array;

public class ZeroToRight {
    public static void main(String[] args) {
        int[] arr = {7,0,2,6,0,4};
        int[] res = zeroToRight(arr);
        for(int r:res){
            System.out.println(r+ " ");
        }
    }

    private static int[] zeroToRight(int[] arr) {
        int n = arr.length;
        for (int i = 0,j = 0; i < n; i++) {

            if (i!=j  && arr[i] != 0){
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
        return arr;
    }
}
