package src.ArraySambhuSir;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,6};
        int prod = 1;
        for (int a:arr){
            prod = prod*a;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = prod / arr[i];
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
