package src.ArraySambhuSir;
// right rotate
public class ArrayRotationLeft {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int firstEle = arr[0];
        for (int i = 1; i <= arr.length-1; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=firstEle;

        for(int x : arr){
            System.out.println(x);
        }
    }
}
