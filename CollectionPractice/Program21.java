package src.CollectionPractice;

import java.util.ArrayList;

public class Program21 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(13);
        l1.add(17);
        l1.add(16);
        l1.add(14);

        System.out.println("->"+l1);
        for (Integer i : l1) {
            if (i%2 == 1){
                System.out.println(i);
                l1.remove(i);
            }
        }
        System.out.print("->"+l1);

    }
}
