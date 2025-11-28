package src.ArraySambhuSir;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {60,40,30,20,50,10};
        int n = arr.length;
        int[] res = new int[n+1];
        int k = 3;
        int ele = 70;
        for (int i = 0; i <= k; i++) {
            res[i] = arr[i];
        }
        res[k]=ele;
        for (int i = k; i < arr.length; i++) {
            res[i+1] = arr[i];
        }
        for(int a:res){
            System.out.print(a+" ");
        }
    }
}
