package src.practic.Recursion;

public class PrintNameFive {
    public static void printName(int i, int n){
        if (i >= n) {
            System.out.println("Raj");
            printName(i+1,n);
        }else {
            return;
        }
    }
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        printName(i,n);
    }
}
