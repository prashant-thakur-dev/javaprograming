package src.practic.while_loop;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 10,i=2;
        int h = n/2;
        boolean flag = false;
        while (i<=h){
            if (n%i == 0){
                flag =false;
            }
            else {
                flag = true;
            }
            i++;
        }
        if (!flag){
            System.out.println("not a prime no");
        }
        else{
            System.out.println("prime no");
        }
    }
}
