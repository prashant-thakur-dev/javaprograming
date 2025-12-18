package src.practic.while_loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=2,a = 0,b = 1;
        int n = 7;
        System.out.println(a +" "+ b);
        while (i<=n){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }
}
