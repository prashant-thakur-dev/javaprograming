package src.MethodChaining;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Prashant");
        Student s2 = new Student(101,"Prashant");
        System.out.println(s1.equals(s2));
    }
}
