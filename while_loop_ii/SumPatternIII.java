package src.while_loop_ii;

public class SumPatternIII {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int sum = 0;
        while(a<100){
            sum = sum+(a*a*b);
//            System.out.println(sum);
            a++;
            b++;
        }
        System.out.println(sum);
    }
}
