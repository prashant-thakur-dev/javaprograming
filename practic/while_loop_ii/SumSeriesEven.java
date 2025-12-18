package src.practic.while_loop_ii;

public class SumSeriesEven {
    public static void main(String[] args) {
        double i = 2;
        double sum = 0;
        while(i<=100){
            sum = sum+(1/i);
            i+=2;
        }
        System.out.println(sum);
    }
}
