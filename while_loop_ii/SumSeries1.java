package src.while_loop_ii;

public class SumSeries1 {
    public static void main(String[] args) {
        double a = 1, b = 2;
        double sum = 0;
        while(a<100){
            sum = sum+(1/a*b);
            a++;
            b++;
        }
        System.out.println(sum);
    }
}
