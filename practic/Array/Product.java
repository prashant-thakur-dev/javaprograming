package src.practic.Array;

public class Product {
    String brand;
    String name;
    double price;
    String type; // e.g. "Shirt", "Electronics", "Shoes", etc.

    public Product(String brand, String name, double price, String type) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Name: " + name +
                ", Price: " + price + ", Type: " + type);
    }
}
