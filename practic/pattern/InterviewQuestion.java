package src.practic.pattern;

public class InterviewQuestion {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n-1;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int mid = star/2+1;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                if (j<mid){
                    System.out.print(num++ +" ");
                }
                else {
                    System.out.print(num-- +" ");
                }
            }
            star+=2;
            space--;
            num = mid+1;
            System.out.println();
        }
    }
}
