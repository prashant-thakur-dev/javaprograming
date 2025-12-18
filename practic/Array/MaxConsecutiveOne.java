package src.practic.Array;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1,1,6,1,1,1};
        int maxCon = findMaxConOne(nums);
        System.out.println(maxCon);
    }

    private static int findMaxConOne(int[] nums) {
        int tempCount = 0;
        int finalCount = 0;
        for (int n:nums){
            if (n == 1){
                tempCount++;
            }
            else{
                finalCount = Math.max(tempCount,finalCount);
                tempCount = 0;
            }
        }
        return Math.max(tempCount,finalCount);
    }
}
