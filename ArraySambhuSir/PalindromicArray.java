package src.ArraySambhuSir;

import java.util.Arrays;

public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {10,20,30,30,20,10};

        boolean ans = isArrayPalindromic(arr2);
        System.out.println(ans);
    }

    private static boolean isArrayPalindromic(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while (s<e){
            if (arr[s]!=arr[e]){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
}
