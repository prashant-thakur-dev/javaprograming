package src.CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Program22 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(13);
        l1.add(17);
        l1.add(16);
        l1.add(14);

        System.out.println("->"+l1);
        Iterator<Integer> itr = l1.iterator();
        while (itr.hasNext()){
            Integer n = itr.next();
            if (n%2 == 1){
                itr.remove();
            }
        }
        System.out.print("->"+l1);

    }
}
