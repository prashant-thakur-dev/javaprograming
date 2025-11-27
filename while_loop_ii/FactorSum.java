package src.while_loop_ii;

import java.util.Scanner;

public class FactorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while(i<=n/2){
            if(n%i == 0){
//                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of factor: " +sum);
    }
}
