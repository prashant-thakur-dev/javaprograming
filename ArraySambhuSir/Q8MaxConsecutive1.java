package src.ArraySambhuSir;

public class Q8MaxConsecutive1 {
    public static void main(String[] args) {
        int[] nums ={1,1,6,1,1,1};
        int maxCon = findMaxConsecutiveOnes(nums);
        System.out.println(maxCon);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int totalCount = 0;
        int tempCount = 0;
        for (int x : nums){
            if (x == 1) {
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
