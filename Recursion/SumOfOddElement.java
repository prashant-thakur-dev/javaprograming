package src.Recursion;

public class SumOfOddElement {
    public static void main(String[] args) {
        int n = 10;
        int sum = sumOdd(n);
        System.out.println(sum);
    }

    private static int sumOdd(int n) {
        if (n <= 0) {
            return 0;
        } else if (n%2 == 0) {
            return sumOdd(n-1);
        }else{
            return  n+sumOdd(n-2);
        }
    }
}
