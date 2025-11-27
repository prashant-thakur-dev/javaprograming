package src.ArraySambhuSir;

public class Q45 {
    public static void main(String[] args) {
        int[] b = {11,4,8,4,5,8,5,8,9,5,11};
        int n = b.length-1;
        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = i+1; j < n; j++) {
                if (b[i] == b[j]){
                    c++;
                    b[j] = b[n];
                    n--;
                    j--;
                }
            }
            System.out.println(c);
        }

    }
}
