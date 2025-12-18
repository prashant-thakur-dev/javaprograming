package src.practic.whileloopIII;

import java.util.Scanner;

public class q1 {
    public static void printEachNumber(int n){
        while (n!=0){
            System.out.println(n%10);
            n = n/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEachNumber(n);
    }
}
