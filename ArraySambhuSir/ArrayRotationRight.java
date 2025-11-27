package src.ArraySambhuSir;
// right rotate
public class ArrayRotationRight {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,80,90};
//        System.out.println(arr.length);
//        System.out.println(arr[arr.length-1]);



        int lastEle = arr[arr.length-1]; //90
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0]=lastEle;

        for(int x : arr){
            System.out.println(x);
        }
    }
}
