package src.collection;

import java.util.ArrayList;

public class q2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        arr.add(10);
        arr.add(67);
        arr.add(40);
        arr.add(33);
        arr.add(50);
        arr.add(20);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                sum = sum + arr.get(i);
            }
        }
        System.out.println(sum);
    }
}
