package src.Recursion;

public class PrintFromN {
    public static void printName(int i, int n){
        if (i < 1) {
            return;
        }
        System.out.println(i);
        printName(i-1,n);
    }
    public static void main(String[] args) {
//        int i = 1;
        int n = 5;
        printName(n,n);
    }
}
