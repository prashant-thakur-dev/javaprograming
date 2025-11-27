package src.whileloopIII;

import java.util.Scanner;

public class q6 {
    public static void getBiggestAndSmallestDifference(int n){
        int biggest = 0;
        int samllest = 10;
        while(n != 0){
            int x = n%10;
            if (x>biggest){
                biggest = x;
            }
            if (x<samllest){
                samllest = x;
            }

            n=n/10;
        }
        System.out.println(biggest-samllest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getBiggestAndSmallestDifference(n);
    }
}
