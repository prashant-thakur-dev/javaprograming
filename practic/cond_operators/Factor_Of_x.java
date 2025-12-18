package src.practic.cond_operators;

import java.util.Scanner;

public class Factor_Of_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x%y==0 ? y+" is factor of "+ x: y+" is not factor of "+ x);
    }
}
