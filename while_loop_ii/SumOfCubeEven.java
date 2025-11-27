package src.while_loop_ii;

public class SumOfCubeEven {
    public static void main(String[] args) {
        int sum =0;
        int i =2;
        while(i<=100){
            sum = sum+ i*i*i;
            i+=2;
        }
        System.out.println(sum);
    }
}
