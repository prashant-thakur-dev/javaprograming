package src.practic.cond_operators;

import java.util.Scanner;

public class Three_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(x>=100 && x<=999 ? "three digit number": "not three digit number");
    }
}
