package src.Super;

public class Car extends Vehicle{

    String brand;

    Car(){
        super();

    }
    Car(String name,int hp,String brand){
        super(name,hp);
        this.brand = brand;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("car is driving");
        System.out.println("car is driving "+super.name);
    }
}
