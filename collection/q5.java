package src.collection;

import java.util.ArrayList;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        int userInput = 13;
        List<Student> students = new ArrayList<>();
        students.add(new Student(12,"raj","java"));
        students.add(new Student(13,"hello","mern"));
        students.add(new Student(14,"mohan","mango"));
        students.add(new Student(15,"sohan","data"));

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == userInput) {
                System.out.println(students.get(i));
                break;
            }
        }
    }
}
