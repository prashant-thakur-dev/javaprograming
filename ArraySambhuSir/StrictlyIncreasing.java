package src.ArraySambhuSir;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        int[] a = {1,2,15,6,7,9};
        boolean flag = isStrictlyIncreasing(a);
        System.out.println(flag);
    }

    private static boolean isStrictlyIncreasing(int[] a) {
        for (int j = 1; j < a.length; j++) {
            if (a[j] <= a[j-1]){
                return false;
            }
        }
        return true;
    }
}
