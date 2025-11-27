package src.ArraySambhuSir;

public class BiggestAndSmallestDiffrence {
    public static void main(String[] args) {
        int[] arr = {10,4,8,15,2};
        int maxInt = arr[0];
        int minInt = arr[0];
        for (int a : arr){
            if (a>=maxInt){
                maxInt = a;
            }
            if (a<=minInt){
                minInt = a;
            }
        }
        System.out.println("Max: "+ maxInt);
        System.out.println("Min: "+ minInt);
    }
}
