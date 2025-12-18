package src.practic.pattern;

public class q17 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print(i+" ");
            }
            star++;
            System.out.println();
        }
    }
}
