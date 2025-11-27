package src.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWithMap {
    public static void main(String[] args) {
        int[] arr = {2,15,11,7};
        int target = 9;
        int[] ans = twoSum(arr, target);
        for (int a:ans){
            System.out.print(a+" ");
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> m1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            int val = m1.getOrDefault(comp,-1);
            if (val>= 0){
                return new int[]{val,i};
            }
            else {
                m1.put(arr[i],i);
            }
        }

        return new int[]{};
    }
}
