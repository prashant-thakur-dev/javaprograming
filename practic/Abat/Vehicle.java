package src.practic.Abat;

public abstract class Vehicle {
    abstract void start();
    abstract void stop();
    public static void fly(){
        System.out.println("fly");
    }
    public void swim(){
        System.out.println("swim");
    }
}
