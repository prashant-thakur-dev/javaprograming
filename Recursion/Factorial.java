package src.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 1;
        int fact = factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if (n > 5){
            return 1;
        }
        return n*factorial(n+1);
    }
}
