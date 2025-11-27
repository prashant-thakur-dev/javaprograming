package src.ArraySambhuSir;
// for a given number N print if the no is even or odd without using if and else or conditional.


public class Q1BySambhuSir {
    public static void main(String[] args) {
        int n = 952;
        String[] str = {"even","odd"};
        System.out.println(n+" is: "+ str[n%2]);
    }
}
