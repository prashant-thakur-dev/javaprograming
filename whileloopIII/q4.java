package src.whileloopIII;

import java.util.Scanner;

public class q4 {
    public static void getGreaterThan5(int n){
        while(n != 0){
            int x = n%10;
            if (x>=5)
                System.out.println(x);

            n=n/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getGreaterThan5(n);
    }
}
