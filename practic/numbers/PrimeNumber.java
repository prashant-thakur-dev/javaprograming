package src.practic.numbers;

public class PrimeNumber {
    public static boolean isPrime(int n) {

        int c = 0;
        for (int i = 2; i <= n/2; i++) {
            if(n%i == 0){
                c++;
            }
        }
        if (n==1||c >= 1) {
            return false;
        }
        else{
            return true;

        }
    }
}
