package src.ArraySambhuSir;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                System.out.println(arr[i]);
            }
            if (isPrime(arr[i])){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        if (n==2){
            return true;
        }
        if (n%2 == 0){
            return false;
        }
        for (int i = 3; i*i < n; i+=2) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
