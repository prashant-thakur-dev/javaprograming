package src.practic.pattern;

public class q10 {
    public static void main(String[] args) {
        int n = 11;
        int mid = n/2+1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i==1 || j==n || i==n || j == 2 || i==2 || j==n-1 || i==n-1 || i==j || i+j == n+1 || i==mid || j==mid) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            System.out.println("* * ");
        }
    }
}
