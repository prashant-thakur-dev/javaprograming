package src.Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,15,11,7};
        int target = 9;
        int[] ans = twoSum(arr, target);
        for (int a:ans){
            System.out.print(a+" ");
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
