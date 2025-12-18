package src.Searching;
/*
when an array is sorted then we can search mid ele and accord we can go in left and right which is called binary search
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8,9,12,45,63,87,99,100};
        int k = 12;
        int s = 0,e=arr.length;
        while (s<e){
            int mid = s+(e-s)/2;
            if (arr[mid] == k){
                System.out.println(mid);
                return;
            }
            else if (arr[mid]>k) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }

    }
}
