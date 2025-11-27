package src.inher;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        System.out.println(v1.x);
        System.out.println(v1.a);
        v1.drive();

        Vehicle v2 = new Bike();
        System.out.println(v2.x);
        System.out.println(v2.a);
        v2.drive();

        Car c = new Car();
        c.drive();


    }
}
