package src.practic.practice;

public class Method {
    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor();
        CopyConstructor c1 = new CopyConstructor("mango","green","blend");
        CopyConstructor c2 = new CopyConstructor("apple","red");
        CopyConstructor c3 = new CopyConstructor(c1);


        System.out.println(c.name);
        System.out.println(c.color);
        System.out.println(c.taste);
        System.out.println("==========================");
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.taste);
        System.out.println("==========================");
        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.taste);
        System.out.println("==========================");
        System.out.println(c3.name);
        System.out.println(c3.color);
        System.out.println(c3.taste);
        System.out.println("==========================");

    }

}
