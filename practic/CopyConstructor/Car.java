package src.practic.CopyConstructor;

public class Car extends Vehicle{
    int carId;
    Car(int carId){
        super(carId);
        this.carId = carId;
    }
    Car(String name, Car c){
        super(name);
        this.carId = c.carId;

    }
}
