package src.pattern;

public class q15 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        int space = n-1;
        int num = n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print(num+" ");
            }
            star+=2;
            space--;
            num--;
            System.out.println();
        }
    }
}
