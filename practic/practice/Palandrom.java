package src.practic.practice;

public class Palandrom {
    public static void main(String[] args) {
        int n = 121;
        int on = n;
        int rev = reverseNumber(n);
        if (on == rev){
            System.out.println("it is palandrom no");
        }
        else{
            System.out.println("it is not palandrom no");
        }
    }

    private static int reverseNumber(int n) {
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
}
