package src.practic.practice;

public class Missing {
    public static void main(String[] args) {
        int[] arr = {20,24,28,32};
        int first = arr[0]-1;
        int j = 1;
        int[] newArr = new int[arr[arr.length-1]-arr[0]+1];
        for(int i = 0;i<newArr.length;i++){
            newArr[i] = first+j;
            j++;
        }
        for (int i = 0,k = 0; i < newArr.length; i++) {
            if (newArr[i]==arr[k]){
                k++;
            }
            else {
                System.out.print(newArr[i]+" ");
            }
        }
    }
}
