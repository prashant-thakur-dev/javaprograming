package src.cond_operators;

import java.util.Scanner;

public class Lower_Case_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        System.out.println(Character.isLowerCase(x) ? "lower case":"not lower case");

    }
}
