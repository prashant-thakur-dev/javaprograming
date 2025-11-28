package src.ArraySambhuSir;

public class Increasing {
    public static void main(String[] args) {
        int[] arr = {2,7,7,8,9};
        boolean sort = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                sort = false;
                break;
            }
        }
        System.out.println(sort);
    }
}
