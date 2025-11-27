package src.Recursion;

public class SumRec {

    private static void sumRec(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumRec(i-1,sum+i);
    }

    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        sumRec(i,sum);
    }

}
