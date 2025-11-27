package src.MethodChain;

public class Main {
    public static void main(String[] args) {
        Student s = new Student().setName("rahul").setAge(23).display().display();
        s.setName("Raj");
        s.setAge(19);
        s.display();
    }
}
