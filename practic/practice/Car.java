package src.practic.practice;

public class Car extends Vech{
    String brand;
    int hp;
    double price;

    Car(){
        System.out.println("no arggument");
    }
    Car(String brand,int hp){
        this();
        this.brand = brand;
        this.hp = hp;
    }
    Car(String name,int tire,double price){
        super.name = name;
        super.tire = tire;
        this.price = price;

    }


    @Override
    public void drive(){
        super.drive();
        System.out.println(super.name);
        System.out.println("car is driving+_+_+_+_+_+_+_+_+");
    }
}
