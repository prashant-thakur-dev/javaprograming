package src.numbers;

import java.util.Scanner;

import static src.numbers.PrimeNumber.isPrime;

public class NumberOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                c++;
                System.out.println(i);
            }
        }
        System.out.println("total no of prime no is: "+c);
    }

}
