package src.collection;

import java.util.ArrayList;

public class q {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add(10);
        arr.add(20);
        arr.add(15.0);
        arr.add("hello");
        arr.add('P');
        arr.add(false);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
