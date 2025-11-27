package src.pattern;

public class Rombus {
    public static void main(String[] args) {
        int n = 5;
//        int mid = n/2+1;
        int star = n;
        int space = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            space--;

            System.out.println();
        }
    }
}
