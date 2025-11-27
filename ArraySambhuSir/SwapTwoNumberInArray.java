package src.ArraySambhuSir;

public class SwapTwoNumberInArray {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50,60};
        int s = 1;
        int e = 4;
        int[] ans = swapArray(nums, s, e);
        for (int x : ans){
            System.out.println(x);
        }
    }

    private static int[] swapArray(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;

        return nums;
    }
}
