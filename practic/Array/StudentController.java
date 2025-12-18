package src.practic.Array;

import java.util.Scanner;

public class StudentController {

    public static void task1(Student[] list){
        int num = 1;
        for (int i = 0; i < list.length; i++) {
            System.out.println("Student "+ (num++));
            System.out.println("=========================");
            System.out.println("ID: "+list[i].id);
            System.out.println("NAME: "+list[i].name);
            System.out.println("AGE: "+list[i].age);
            System.out.println("YOJ: "+list[i].yoj);
            System.out.println("=========================");
        }
        System.out.println("====================================================================================================");
    }
    public static void task2(Student[] list, int year){
        int num = 1;
        for (int i = 0; i < list.length; i++) {
            if (year == list[i].yoj){
                System.out.println("Student "+ (num++));
                System.out.println("=========================");
                System.out.println("ID: "+list[i].id);
                System.out.println("NAME: "+list[i].name);
                System.out.println("AGE: "+list[i].age);
                System.out.println("YOJ: "+list[i].yoj);
                System.out.println("=========================");
            }
        }
        System.out.println("====================================================================================================");

    }

    public static void task3(Student[] list){
        Student max = list[0];
        for (int i = 0; i < list.length; i++) {
            assert max != null;
            if (list[i].name.length() >= max.name.length()) {
                max = list[i];
            }
        }
        System.out.println("Student {ID: "+ max.id + " NAME: "+ max.name +" AGE: "+ max.age+" YOJ: "+ max.yoj+" }");
    }
    public static void task4(Student[] list){
        Student max = list[0];
        for (int i = 0; i < list.length; i++) {
            assert max != null;
            if (list[i].age <= max.age) {
                max = list[i];
            }
        }
        System.out.println("Student {ID: "+ max.id + " NAME: "+ max.name +" AGE: "+ max.age+" YOJ: "+ max.yoj+" }");
    }

    public static void task5(Student[] list){
        Student min = list[0];
        for (int i = 0; i < list.length; i++) {
            assert min != null;
            if (list[i].age >= min.age) {
                min = list[i];
            }
        }
        System.out.println("Student {ID: "+ min.id + " NAME: "+ min.name +" AGE: "+ min.age+" YOJ: "+ min.yoj+" }");
    }

    public static void main(String[] args) {
        Student[] list = new Student[5];
        list[0] = new Student(101, "Raj", 23, 2025);
        list[1] = new Student(102, "Ankit", 20, 2024);
        list[2] = new Student(103, "Utkarsh", 19, 2024);
        list[3] = new Student(104, "Mohit", 25, 2025);
        list[4] = new Student(105, "Piyush", 21,2023);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter year u want to check: ");
        int year = sc.nextInt();

        task1(list);
        task2(list, year);
        task3(list);
        task4(list);
        task5(list);

    }
}
