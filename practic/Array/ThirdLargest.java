package src.practic.Array;

public class ThirdLargest {
    public static void main(String[] args) {
//        int[] arr = {80,80,43,50,38,63,58,80};
        int[] arr = {1,2};
        int res = thirdLargest(arr);
        System.out.println(res);
    }
    public static int thirdLargest(int[] arr){
        long large = Long.MIN_VALUE;
        long secondLarge = Long.MIN_VALUE;
        long thirdLarge = Long.MIN_VALUE;
        for(int a:arr){
            if (a>large){
                thirdLarge = secondLarge;
                secondLarge = large;
                large = a;
            }
            else if(a>secondLarge && a!=large){
                thirdLarge = secondLarge;
                secondLarge = a;
            }
            else if(a>thirdLarge && a!=secondLarge && a!=large){
                thirdLarge = a;
            }
        }
        return thirdLarge!= Long.MIN_VALUE?(int)thirdLarge:(int)large;
    }
}
