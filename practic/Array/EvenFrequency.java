package src.practic.Array;

import static src.practic.Array.KthLargest.maxEle;
import static src.practic.Array.KthLargest.minEle;

public class EvenFrequency {
    public static void main(String[] args) {
        int[] arr = {7,6,6,5,7,10,10,7,7,5,6,9,9,8};
        int k = 4;
//        int[] arr = {1,2};
        int maxValue = maxEle(arr);
        int minValue = minEle(arr);
        int count = 0;

        int[] freq = new int[maxValue-minValue+1];
        for (int a:arr){
            freq[a-minValue]++;
        }
//        for (int i = 0; i < freq.length; i++) {
//            System.out.println(i+minValue + " "+ freq[i]);
//        }

        evenFrequency(freq,minValue);
    }
    public static void evenFrequency(int[] freq, int minValue){
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]%2 == 0) {
                System.out.println(i+minValue);
            }
        }
    }
}
