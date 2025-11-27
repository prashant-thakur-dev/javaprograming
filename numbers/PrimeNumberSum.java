package src.numbers;

import java.util.Scanner;

public class PrimeNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                int sum = 0;
                int j = i;
                while (j>0){
                    sum = sum + j%10;
                    j/=10;
                }
                if (isPrime(sum)){
                    c++;
                    System.out.println(i+" is prime "+" digit sum "+ sum +" is also prime");
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
