package src.Recursion;

public class PrintUpToN {
    public static int printName(int i, int n){
        if (i >= n) {
            return n;
        }else {
            System.out.println(i);
            return printName(i+1,n);
        }
    }
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        printName(i,n);
    }
}
