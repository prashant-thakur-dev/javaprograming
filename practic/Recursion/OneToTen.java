package src.practic.Recursion;
// a method can call itself inside method body to form recurssion;
//if not controlled there will be "stackoverflow error"
// we have to use
public class OneToTen {
    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
    public static void printNumber(int n){
        if (n<=3){
            System.out.println(n);
            printNumber(n+1);
        }
    }
}
