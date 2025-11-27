package src.Recursion;

public class Power {
    static int userInput = 3;
    public static void main(String[] args) {
        int b = 5;
        int p = 1;

        int power = getPower(b, p);
        System.out.println(power);
    }
    public static int getPower(int b, int p){
        if (p == userInput){
            return b;
        }
        return b*getPower(b,p+1);
    }
}
