package src.Recursion;

public class HCF {
    public static void main(String[] args) {
        System.out.println(getHCF(48,18));
    }

    private static int getHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getHCF(b,a%b);
    }
}
