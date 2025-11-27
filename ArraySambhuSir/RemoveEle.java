package src.ArraySambhuSir;

public class RemoveEle {
    public static void main(String[] args) {
        int[] arr = {60,40,30,20,50,10};
        int[] res = new int[arr.length-1];
        int k = 3;
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        for (int i = k; i < arr.length-1; i++) {
            res[i] = arr[i+1];
        }
        for(int a:res){
            System.out.print(a+" ");
        }
    }
}
