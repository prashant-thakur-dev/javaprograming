package src.ArraySambhuSir;

public class EvenElement {
    public static void main(String[] args) {
        int[] arr = {10,20,35,40,50};
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
