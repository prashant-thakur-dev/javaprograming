package src.practic.Polymorphism;

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add = new Address("Delhi");
        Student s = new Student("Raj", add);
        Student s2 = (Student) s.clone();

        System.out.println(s.address.city);

        s2.address.city = "Noida";

        System.out.println(s.address.city);

    }
}
