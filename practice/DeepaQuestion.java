package src.practice;

import java.util.Scanner;

public class DeepaQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int currLargest = 0;
        while (num>0){
            int digit = num%10;
            currLargest = largest(currLargest, digit);
            num=num/10;
        }
        System.out.println(currLargest);
    }

    public static int largest(int currLargest, int digit){
        if (digit>currLargest){
            currLargest = digit;
        }
        return currLargest;
    }
}
