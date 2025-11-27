package src.Abat;

public class Driver {
    public static void main(String[] args) {
        Vehicle v1 = new ElectrinCar();
        v1.start();
        v1.stop();
        v1.fly();
        Car c1 = (Car) v1;
        c1.openGate();
        ElectrinCar e1 = (ElectrinCar) v1;
        e1.charge();
    }
}
