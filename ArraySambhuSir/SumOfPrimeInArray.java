package src.ArraySambhuSir;

public class SumOfPrimeInArray {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,6,7,8,9,10,11};
        int sum = 0;
        for (int x : b){
            if (isPrime(x)){
                sum = sum + x;
            }
        }
        System.out.println("sum of all the prime no in array is : "+ sum);
    }

    private static boolean isPrime(int x) {
        boolean flag = true;
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i*i <= x; i++) {
            if (x%i == 0){
                flag = false;
            }
        }
        return flag;
    }
}
