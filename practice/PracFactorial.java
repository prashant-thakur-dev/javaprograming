package src.practice;

import java.util.Scanner;

public class PracFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
        int twoSum = PracMethod.add(10, 20);
        System.out.println(twoSum);
        int threeSum = PracMethod.add(10, 20,30);
        System.out.println(threeSum);
        PracMethod s = new PracMethod();
        int subt = s.sub(20,10);
        System.out.println(subt);
        double subtDouble = s.sub(20.5,10);
        System.out.println(subtDouble);
    }
    public static int factorial(int n){
        int fact = 1;
        while (n>0){
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
