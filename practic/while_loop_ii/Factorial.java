package src.practic.while_loop_ii;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        int i = 1,total = 1;
        while (i<=n){
            total = total * i;
            i++;
        }
        System.out.println(total);
    }
}
