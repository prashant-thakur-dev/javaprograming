package src.classandobject;

public class Driver {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        System.out.println(b1.author);
        System.out.println(b1.title);
        System.out.println(b1.year);

        System.out.println(b2.author);
        System.out.println(b2.title);
        System.out.println(b2.year);
    }
}
