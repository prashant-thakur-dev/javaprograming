package src.cond_operators;

import java.util.Scanner;

public class IsAlfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        System.out.println(Character.isAlphabetic(x) ? "Alphabet":"not Alphabet");

    }
}
