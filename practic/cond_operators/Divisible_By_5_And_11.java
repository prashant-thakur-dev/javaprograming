package src.practic.cond_operators;

import java.util.Scanner;

public class Divisible_By_5_And_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(x%5==0 && x%11==0 ? "Divisible By 5 and 11": "Not Divisible By 5 And 11");
    }
}
