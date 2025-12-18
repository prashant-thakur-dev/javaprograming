package src.practic.cond_operators;

import java.util.Scanner;

public class Valid_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b>c && b+c>a && a+c>b ? "valid triangle": "not valid triangle");

    }
}
