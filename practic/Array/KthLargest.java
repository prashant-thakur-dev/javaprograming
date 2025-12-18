package src.practic.Array;
/*
pattern for solving this question

 */


public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {7,8,6,6,5,7,10,10,7,7,5,6,8};
        int k = 5;
//        int[] arr = {1,2};
        int maxValue = maxEle(arr);
        int minValue = minEle(arr);
        int count = k;

        int[] freq = new int[maxValue-minValue+1];
        for (int a:arr){
            freq[a-minValue]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.println(i+minValue + " "+ freq[i]);
        }
        for(int i=freq.length-1;;i--){
            if(freq[i]>0){
                k-=freq[i];
                if (k <= 0) {
                    System.out.println(i+minValue+"is "+ count+"th largest element");
                    break;
                }
            }
        }
    }

    public static int minEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int a:arr){
            if(a<min){
                min = a;
            }
        }
        return min;
    }

    public static int maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max){
                max = a;
            }
        }
        return max;
    }

}
