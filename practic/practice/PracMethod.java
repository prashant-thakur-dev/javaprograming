package src.practic.practice;

import java.util.Scanner;

public class PracMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int twoSum = add(a, b);
        int threeSum = add(a, b, c);
        System.out.println(twoSum);
        System.out.println(threeSum);
    }
    public static int add(int a,int b) {
        return a + b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public double sub(double a,int b){
        return a-b;
    }

}
