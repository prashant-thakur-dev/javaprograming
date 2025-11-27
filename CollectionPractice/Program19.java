package src.CollectionPractice;

import java.util.ArrayList;

public class Program19 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(13);
        l1.add(17);
        l1.add(16);
        l1.add(14);

        System.out.println("->"+l1);
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i)%2 == 1){
                l1.remove(i);
                i--;
            }
        }
        System.out.print("->"+l1);

    }
}
