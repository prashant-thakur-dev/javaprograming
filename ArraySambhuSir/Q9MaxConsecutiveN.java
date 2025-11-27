package src.ArraySambhuSir;

public class Q9MaxConsecutiveN {
    public static void main(String[] args) {
        int[] nums ={1,1,6,5,5,5,5,1,5,5,5};
        int n = 5;
        int maxCon = findMaxConsecutiveOnes(nums, n);
        System.out.println(maxCon);
    }

    private static int findMaxConsecutiveOnes(int[] nums, int n) {
        int totalCount = 0;
        int tempCount = 0;
        for (int x : nums){
            if (x == n) {
                tempCount++;
            }
            else {
                totalCount = Math.max(tempCount,totalCount);
                tempCount = 0;
            }
        }

        return Math.max(tempCount,totalCount);
    }
}
