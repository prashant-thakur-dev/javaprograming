package src.pattern;

public class q13 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            star++;
            System.out.println();
        }
    }
}
