package src.while_loop_ii;

public class SumOfCubeOdd {
    public static void main(String[] args) {
        int sum =0;
        int i =1;
        while(i<=100){
            sum = sum+ i*i*i;
            i+=2;
        }
        System.out.println(sum);
    }
}
