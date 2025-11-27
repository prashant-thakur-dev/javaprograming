package src.Polymorphism;

public class Student implements Cloneable{
    String name;
    Address address;

    Student(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
