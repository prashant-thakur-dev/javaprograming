package src.whileloopIII;

import java.util.Scanner;

public class q5 {
    public static void getBiggest(int n){
        int biggest = 0;
        while(n != 0){
            int x = n%10;
            if (x>biggest){
                biggest = x;
            }

            n=n/10;
        }
        System.out.println(biggest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getBiggest(n);
    }
}
