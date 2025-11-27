package src.Array;

import static src.Array.KthLargest.maxEle;
import static src.Array.KthLargest.minEle;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {7,6,6,5,7,10,10,7,7,5,6,9,9,8};

        int res = printFrequency(arr);
        System.out.println(res);
    }

    private static int printFrequency(int[] arr) {
        int min = minEle(arr);
        int max = maxEle(arr);;
        int maxfreq = 0;
        int maxfreqElement = 0;
        System.out.println(min);
        System.out.println(max);
        int[] freq = new int[max-min+1];

        for(int a:arr){
            freq[a-min]++;
        }
        for (int i = 0; i < freq.length; i++) {

            if(freq[i]>maxfreq){
                maxfreq = freq[i];
                maxfreqElement = i+min;

            }
        }
        return maxfreqElement;
    }
}
