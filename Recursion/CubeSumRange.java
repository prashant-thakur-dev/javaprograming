package src.Recursion;

public class CubeSumRange {
    public static void main(String[] args) {
        int i = 1;
        int sum = squareSumRange(i);
        System.out.println(sum);
    }

    private static int squareSumRange(int i) {
        if(i==11) {
            return 0;
        }
        return i*i*i + squareSumRange(i+1);
    }
}
