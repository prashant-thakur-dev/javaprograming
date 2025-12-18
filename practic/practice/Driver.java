package src.practic.practice;

public class Driver {
    public static void main(String[] args) {
        Vech v = new Car("tata", 500);
        Car c = (Car) v;
        v.drive();
        System.out.println(((Car) v).brand);
        System.out.println(((Car) v).hp);
        System.out.println(v.tire);
        System.out.println(v.name);
        c.drive();
        System.out.println(c.brand);
        System.out.println(c.hp);
        System.out.println(c.tire);
        System.out.println(c.name);
        System.out.println("======================================");
        Vech v1 = new Car("harier", 4 , 400000);
        Car c1 = (Car) v1;
        v1.drive();
        System.out.println(((Car) v1).brand);
        System.out.println(((Car) v1).hp);
        System.out.println(v1.tire);
        System.out.println(v1.name);
        c1.drive();
        System.out.println(c1.brand);
        System.out.println(c1.hp);
        System.out.println(c1.tire);
        System.out.println(c1.name);
    }
}
