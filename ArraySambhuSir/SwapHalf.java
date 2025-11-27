package src.ArraySambhuSir;

public class SwapHalf {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int firstHalfStart = 0;
        int firstHalfEnd = arr.length/2-1;
        while(firstHalfStart< firstHalfEnd) {
            SwapF.swapFun(arr, firstHalfStart, firstHalfEnd);
            firstHalfStart++;
            firstHalfEnd--;
        }
        int secondHalfStart = arr.length/2;
        int secondHalfEnd = arr.length-1;
        while(secondHalfStart< secondHalfEnd) {
            SwapF.swapFun(arr,secondHalfStart,secondHalfEnd);
            secondHalfStart++;
            secondHalfEnd--;
        }

        for (int a : arr){
            System.out.println(a);
        }

    }
}
