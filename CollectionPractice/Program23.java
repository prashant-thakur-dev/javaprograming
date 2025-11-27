package src.CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Program23 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(13);
        l1.add(17);
        l1.add(16);
        l1.add(14);

        System.out.println("->"+l1);
        ListIterator<Integer> itr = l1.listIterator(l1.size());
//       forward
//        while (itr.hasNext()){
//            Integer n = itr.next();
//            if (n % 2 == 1) {
//                System.out.println(n);
//            }
//        }
//       backward
        while (itr.hasPrevious()){
            Integer n = itr.previous();
//            if (n % 2 == 0) {
                System.out.println(n);
//            }
        }
        System.out.print("->"+l1);

    }
}
