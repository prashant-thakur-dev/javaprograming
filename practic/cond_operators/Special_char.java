package src.practic.cond_operators;

import java.util.Scanner;

public class Special_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        System.out.println(!Character.isLetterOrDigit(x) ? "Special char":"not special char");

    }
}
