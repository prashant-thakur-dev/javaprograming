package src.numbers;

import java.util.Scanner;

public class AlternetPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                c++;
                if (c%2 == 1){
                    System.out.println(i);
                }
            }
        }
        System.out.println("total no of prime no is: "+c);
    }
    public static boolean isPrime(int n) {

        int c = 0;
        for (int i = 2; i <= n/2; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
