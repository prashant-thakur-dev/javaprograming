package src.practic.Methodchaining2;

// if the return type of method is void we canot connect any method with this method
// if the return tye of an method on premitive so we cannot connect any method with such method

// if a method return non remitive data if a method returns a string then we can chain string methods or a method return car then we can connect car methods
public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car(500,750000,"baleno","black");

        c1.printName().printColor();
    }
}
