package src.numbers;

import java.util.Scanner;

import static src.numbers.PrimeNumber.isPrime;

public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2;; i++) {
            if(isPrime(i)){
                c++;
                if (c == n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
