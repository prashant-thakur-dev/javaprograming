package src.practic.whileloopIII;

import java.util.Scanner;

public class LeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLeftToRight(n);
    }
    public static void printLeftToRight(int n){
        int digit = countDigit(n);
        int num = n;
        while(num>0){
            int digitValue = (n/getPower(10,digit-1))%10;
            System.out.println(digitValue);
            digit--;
            num/=10;
        }
    }

    public static int countDigit(int n){
        int c = 0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    public static int getPower(int a,int b){
        int pow = 1, i = 1;
        while(i<=b){
            pow = pow * a;
            i++;
        }
        return pow;
    }
}
