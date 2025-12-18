package src.practic.while_loop;

public class FactorCount {
    public static void main(String[] args) {
        int n = 28;
        int i = 1;
        int count =0;
        while (i<n){
            if (n%i == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
