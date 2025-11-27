package src.Recursion;

public class TenToOne {
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
    public static void printNum(int n){
        if (n <= 10) {
            printNum(n+1);
            System.out.println(n);
        }
    }
}
