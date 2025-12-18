package src.practic.Recursion;

public class SumRange {
    public static void main(String[] args) {
        int i = 1;
        int sum = sumRange(i);
        System.out.println(sum);
    }

    private static int sumRange(int i) {
        if (i == 101) {
            return 0;
        }
        return i+sumRange(i+1);
    }

}
