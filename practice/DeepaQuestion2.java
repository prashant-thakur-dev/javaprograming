package src.practice;

import java.util.Scanner;

public class DeepaQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int fact = 1;
        while (num>0){
            int digit = num%10;
            int fact = factorial(digit);
            System.out.println(fact);

            num=num/10;
        }
    }

    public static int factorial(int digit){
        int fact = 1;
        while(digit>0){
            fact = fact*digit;
            digit--;
        }
        return fact;
    }
}
