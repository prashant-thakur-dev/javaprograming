package src.practic.CopyConstructor;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(12);
        Vehicle v2 = new Vehicle(12,"Humdai");
        System.out.println(v2.vechId);
        System.out.println(v2.name);
        Vehicle v3 = new Vehicle(v2,"maruti");
        System.out.println(v3.vechId);
        System.out.println(v3.name);

        Car c1 = new Car(123);
        System.out.println(c1.carId);

        Car c2 = new Car("Pagani", c1);
        System.out.println(c2.carId);
    }
}
