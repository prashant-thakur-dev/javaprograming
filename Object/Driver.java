package src.Object;

public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student("Raj");
        Student s2 = new Student("Raj");
        System.out.println(s1.equals(s2));
    }
}
