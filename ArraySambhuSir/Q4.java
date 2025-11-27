package src.ArraySambhuSir;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,6};
        int sum = 0;
        for (int a:arr){
            sum = sum+a;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
