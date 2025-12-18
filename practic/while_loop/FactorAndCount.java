package src.practic.while_loop;

public class FactorAndCount {
    public static void main(String[] args) {
        int n = 28;
        int i = 1;
        int count =0;
        while (i<n){
            if (n%i == 0){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println("\nTotal Factors are: "+count);
    }
}
