package src.ArraySambhuSir;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int a:arr){
            sum = sum+a;
        }
        int avg =sum/ arr.length;
        System.out.println(avg);
        for (int ele: arr){
            if (ele>avg){
                System.out.println(ele);
            }
        }
    }
}
