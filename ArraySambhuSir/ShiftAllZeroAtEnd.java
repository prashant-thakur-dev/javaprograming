package src.ArraySambhuSir;

public class ShiftAllZeroAtEnd {
    public static void main(String[] args) {
        int[] a = {1,0,1,0,0,1,0};
        int[] c = {2,0,2,1,1,0};
        int[] b = {0,2,2,1,0,0,1,2,1,0};
        shiftZero(b);
    }

    public static void shiftZero(int[] nums){

        int zero = 0;
        int ones = 0;
        int tows = 0;
        for(int x: nums){
            if(x == 0){
                zero++;
            }
            else if(x == 1){
                ones++;
            }
            else if(x == 2){
                tows++;
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(i<zero){
                nums[i] = 0;
            }else if(i<zero+ones){
                nums[i] = 1;
            }else {
                nums[i] = 2;
            }
        }



//        int zero = 0;
//        for (int x : a){
//            if (x == 0){
//                zero++;
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (i < zero) {
//                a[i] = 0;
//            }
//            else{
//                a[i] = 1;
//            }
//        }
        for (int x:nums){
            System.out.print(x);
        }
    }
}
