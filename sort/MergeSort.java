package src.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {60,40,30,20,50,10};
        int start = 0;
        int end = arr.length-1;
        mergeSort(arr,start,end);

        for(int i :arr){
            System.out.println(i);
        }

    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start<end){
            int mid = start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end-start+1];
        int i1 = start, i2=mid+1, i3=0;
        while (i1<=mid && i2<=end){
            if (arr[i1] < arr[i2]){
                merge[i3++]=arr[i1++];
            }
            else {
                merge[i3++]=arr[i2++];
            }
        }
        while (i1<=mid){
            merge[i3++] = arr[i1++];
        }
        while (i2<=end){
            merge[i3++] = arr[i2++];
        }
        for (int i = start,j=0; j < merge.length; i++,j++) {
            arr[i] = merge[j];
        }
    }
}
