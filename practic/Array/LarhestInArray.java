package src.practic.Array;

public class LarhestInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        int max = 0;
        for (int a : arr){
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
