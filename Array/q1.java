package src.Array;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j < small) {
                small = j;
            }
            if (j > large) {
                large = j;
            }
        }
        System.out.println(large-small);
    }
}
