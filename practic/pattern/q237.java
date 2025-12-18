package src.practic.pattern;

public class q237 {
    public static void main(String[] args) {
        int n = 7;
        int star = 1;
        int num = 1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= star; j++) {
                if(i%2 == 0){
                    System.out.print(num-- +"\t");
                }
                else {
                    System.out.print(num++ +"\t");
                }
            }
            if(i%2 == 1){
                num = num +i;
            }
            else{
                num = num +i+1;
            }
            star++;

            System.out.println();
        }
    }
}
