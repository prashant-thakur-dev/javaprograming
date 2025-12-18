package src.practic.while_loop;

public class DivBy7 {
    public static void main(String[] args) {
        int n = 1, count=0;
        while (n<=100){
            if(n%7 == 0)
                count++;
            n++;
        }
        System.out.println(count);
    }
}
