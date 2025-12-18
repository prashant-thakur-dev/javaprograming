package src.practic.MyCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Emloyee> empList = new ArrayList<>();
        empList.add(new Emloyee(118,"Raj",25000));
        empList.add(new Emloyee(116,"Avi",22000));
        empList.add(new Emloyee(113,"Dev",50000));
        empList.add(new Emloyee(114,"Monty",35000));

        for (Emloyee e:empList){
            System.out.println(e);
        }
        Collections.sort(empList);
        for (Emloyee e:empList){
            System.out.println(e);
        }
    }
}
