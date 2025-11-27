package src.while_loop_ii;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting two numbers
        System.out.print("Enter the base number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the exponent number (b): ");
        int b = scanner.nextInt();

        int result = 1;
        int i = 1;

        // Calculating power using while loop
        while (i <= b) {
            result = result * a;
            i++;
        }

        // Displaying the result
        System.out.println(a + " to power " + b + " is: " + result);

        scanner.close();
    }
}
