package src.practic.Methodchaining2;

public class Car {
    int hp;
    double price;
    String name;
    String color;

    public Car() {
    }

    public Car(int hp, double price, String name,String color) {
        this.hp = hp;
        this.price = price;
        this.name = name;
        this.color = color;
    }

    public Car printName(){
        System.out.println(name);
        return this;
    }

    public Car printColor(){
        System.out.println(color);
        return this;
    }

}
