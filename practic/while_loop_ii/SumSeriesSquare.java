package src.practic.while_loop_ii;

public class SumSeriesSquare {
    public static void main(String[] args) {
        double i = 1;
        double sum = 0;
        while(i<=100){
            sum = sum+(1/(i*i));
            i++;
        }
        System.out.println(sum);
    }
}
