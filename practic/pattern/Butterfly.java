package src.practic.pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n = 7;
        int sStar = 1, eStar = n, mid = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j<=sStar || j>=eStar){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            if (i<mid){
                sStar++;
                eStar--;
            }
            else {
                sStar--;
                eStar++;
            }
            System.out.println();
        }
    }
}
