package src.Super;

public class ElectricCar extends Car{
    int power;
    ElectricCar(){

    }
    ElectricCar(String brand,int power){
        super.brand=brand;
        this.power = power;
    }
}
