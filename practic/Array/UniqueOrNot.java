package src.practic.Array;

public class UniqueOrNot {
    public static void main(String[] args) {
        int[] arr = {7,6,6,5,7,10,10,7,7,5,6,9,9,8};
        boolean ans = uniqueOrNot(arr);

    }

    private static boolean uniqueOrNot(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = arr[n-1];
                    n--;
                    j--;
                }
            }
            if (count >= 1) {
                return true;
            }
        }
        return false;
    }
}
