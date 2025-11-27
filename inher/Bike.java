package src.inher;

public class Bike extends Vehicle{
    int x = 35;
    int c = 300;

    void undoStand(){
        System.out.println("bike stand is off");
    }
    void putStand(){
        System.out.println("bike stand is on");
    }
}
