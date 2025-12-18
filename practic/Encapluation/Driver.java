package src.practic.Encapluation;

public class Driver {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("rahul");
        s.setMarks(458);
        System.out.println(s.getName());
        System.out.println(s.getMarks());
        System.out.println("=====================================");
        Student s1 = new Student("rocky",488);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());

    }
}
