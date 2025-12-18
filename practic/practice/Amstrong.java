package src.practic.practice;

public class Amstrong {
    public static void main(String[] args) {
        int n = 155;
        if (isAmstrong(n)){
            System.out.println("amstrond");
        }
        else{
            System.out.println("not a amstrong");
        }
    }

    private static boolean isAmstrong(int n) {
        int on = n;
        int digit = (n+"").length();
        int sum = 0;

        while (n != 0){
            sum = sum + (int) Math.pow(n%10,digit);
            n/=10;
        }
        return on == sum;
    }
}
