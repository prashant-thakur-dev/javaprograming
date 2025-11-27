package src.Super;

public class Vehicle {
    String name;
    int hp;

    Vehicle(){

    }

    Vehicle(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public void drive(){
        System.out.println("vehicle is driving");
    }
}
