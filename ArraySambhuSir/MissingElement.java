package src.ArraySambhuSir;

public class MissingElement {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,7};
        int n = a.length;
        int total = (n*(n+1))/2;

        int sum = 0;
        for (int x: a) {
            sum = sum + x;
        }
        System.out.println(total-sum);
    }
}
