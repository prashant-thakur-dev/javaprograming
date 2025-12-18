package src.practic.pattern;

public class DiamondGap {
    public static void main(String[] args) {
        int n = 7;
        int mid = n/2+1;
        int star = 1;
        int space = n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                if (i<=mid){
                    System.out.print(i +"   ");
                }
                else{
                    System.out.print(n-i+1+"   ");
                }
            }

            if(i<mid){
                space--;
                star++;
            }
            else {
                space++;
                star--;
            }

            System.out.println();
        }
    }
}
