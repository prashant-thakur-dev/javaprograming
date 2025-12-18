package src.practic.pattern;

public class Q146 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        int space = n/2;
        int mid = n/2+1;
        int num = n/2*(n/2+1)+n/2+1+64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print((char)num-- +"   ");
            }
            if (i<mid){
                star++;
                space--;
            }else{
                star--;
                space++;
            }

            System.out.println();
        }
    }
}
