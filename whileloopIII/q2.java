package src.whileloopIII;

import java.util.Scanner;

public class q2 {

    public static void getEvenDigit(int n){
        while(n != 0){
            int x = n%10;
            if (x%2 == 0)
                System.out.println(x);

            n=n/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getEvenDigit(n);
    }
}
