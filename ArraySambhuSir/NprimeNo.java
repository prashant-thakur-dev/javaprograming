package src.ArraySambhuSir;

import java.util.Arrays;

public class NprimeNo {
    public static void main(String[] args) {
        int n = 20;
        boolean[] a = new boolean[n];
        Arrays.fill(a, true);
        a[0]=false;
        a[1]=false;

        int k = a.length;
        for (int i = 2; i*i < k; i++) {
            if(a[i]){
                for (int j = i*i; j < n; j+=i) {
                    a[j] = false;
                }
            }
        }

        for(int i = 0; i < n; i++){
            if (a[i]){
                System.out.print(i+" ");
            }
        }
    }
}
