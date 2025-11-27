package src.pattern;

public class A {
    public static void main(String[] args) {
        int n = 5;
        int sStar = n, eStar = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if(j == sStar || j == eStar || i==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            sStar--; eStar++;
            System.out.println();
        }
    }
}
