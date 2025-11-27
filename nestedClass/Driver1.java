package src.nestedClass;

public class Driver1 {
    public static void main(String[] args) {
        Car1 c =new Car1();
        System.out.println(c.x);
        c.test();
        Car1.Engine1 e1 = c.new Engine1();
        System.out.println(e1.y);
        e1.start();
    }
}
