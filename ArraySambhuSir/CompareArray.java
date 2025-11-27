package src.ArraySambhuSir;

public class CompareArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3,4,5,6};
        boolean flag=true;

        for (int i = 0; i < a.length; i++) {
            if (a[i]!=b[i]){
                flag = false;
            }
        }
        if (flag){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
