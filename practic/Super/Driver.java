package src.practic.Super;

public class Driver {
    public static void main(String[] args) {
        Car v = new ElectricCar("Harrier", 405);
        ElectricCar e1 = (ElectricCar) v;
        System.out.println(v.name);
        System.out.println(e1.brand);
    }
}
