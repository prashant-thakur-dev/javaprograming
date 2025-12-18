package src.practic.while_loop;

public class Factor {
    public static void main(String[] args) {
        int n = 28;
        int i = 1;
        while (i<=n/2){
            if (n%i == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
