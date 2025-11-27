package src.Array;

public class SecondSmallest {
    public static void main(String[] args) {
            int[] arr = {80,80,43,50,38,63,58,80};
            int res = secondSmallest(arr);
            System.out.println(res);
    }
    public static int secondSmallest(int[] arr){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int a:arr){
            if (a<small){
                secondSmall = small;
                small = a;
            }
            else if(a<secondSmall && a!=small){
                secondSmall = a;
            }
        }
        return secondSmall;
    }
}
