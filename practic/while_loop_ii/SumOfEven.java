package src.practic.while_loop_ii;

public class SumOfEven {
    public static void main(String[] args) {
        int sum =0;
        int i =2;
        while(i<=100){
            sum = sum+ i;
            i+=2;
        }
        System.out.println(sum);
    }
}
