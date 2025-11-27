package src.ArraySambhuSir;

public class ShiftAllZeroAtEnd2 {
    public static void main(String[] args) {
        int[] a = {1,0,7,0,0,5,0};
        int[] b = {0,2,2,1,0,0,1,2,1,0};
        shiftZero(a);
    }

    public static void shiftZero(int[] a){
        for (int i = 0,j = 0; j < a.length; j++) {
            if (a[j] == 0) {
                SwapF.swapFun(a,j,i);
                i++;
            }
        }

        for (int x:a){
            System.out.print(x);
        }
    }
}
