package src.practic.while_loop;

public class DivBy7OrEndBy7Uoto1000 {
    public static void main(String[] args) {
        int n = 1, count=0;
        while (n<=1000){
            if(n%7 == 0 && n%10==7){
                System.out.println(n);
                count++;
            }
            n++;
        }
        System.out.println(count);
    }
}
