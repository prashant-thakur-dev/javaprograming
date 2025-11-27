package src.whileloopIII;

import java.util.Scanner;

public class q7 {
    public static void totalDigit(int n){
        int c=0;
        while(n != 0){
            int x = n%10;
            if (x>=0){
                c++;
            }

            n=n/10;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        totalDigit(n);
    }
}
