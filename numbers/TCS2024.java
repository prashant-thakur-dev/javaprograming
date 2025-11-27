package src.numbers;

public class TCS2024 {
    public static void main(String[] args) {
        int n = 100;
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                System.out.println(i);
                c++;
            }
        }
        System.out.println(c);

    }
    public static boolean isPrime(int n){
        int i = 2;
        while(i*i<=n){
            if (n%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
