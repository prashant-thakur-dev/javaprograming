package src.ArraySambhuSir;

public class AccessFromEnd {
    public static void main(String[] args) {
        int[] arr = {10,20,300,400,50,9999};
        int c = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i]>=100 && arr[i]<=999){
                c++;
            }
        }
        System.out.println(c);
    }
}
