package src.pattern;

public class Triangle {
    public static void main(String[] args) {
        int num = 1;
        int n = 5;
        int star = 1;
        int space = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print(num++ +"\t");
            }
            space--;
            star+=2;
            System.out.println();
        }
    }
}
