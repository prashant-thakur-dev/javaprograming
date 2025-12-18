package src.practic.cond_operators;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(x%2==0 ? "even": "not even");
    }
}
