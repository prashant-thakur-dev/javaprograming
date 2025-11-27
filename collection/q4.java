package src.collection;

import java.util.ArrayList;
import java.util.List;

public class q4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"raj","java"));
        students.add(new Student(13,"hello","mern"));
        students.add(new Student(14,"mohan","mango"));
        students.add(new Student(15,"sohan","data"));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
