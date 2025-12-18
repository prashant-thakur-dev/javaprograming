package src.practic.cond_operators;

import java.util.Scanner;

public class Bigger_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x>y ? x+" is Greater":y+" is Greater");

    }
}
