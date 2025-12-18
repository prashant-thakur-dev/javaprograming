package src.practic.Array;

public class ProductArrayDemo {
    public static void main(String[] args) {
        // a) Store 10 products
        Product[] products = new Product[10];
        products[0] = new Product("Nike", "AirMax Shoes", 3500, "Shoes");
        products[1] = new Product("Adidas", "Running Shoes", 2800, "Shoes");
        products[2] = new Product("Zara", "Formal Shirt", 2000, "Shirt");
        products[3] = new Product("Levis", "Casual Shirt", 1800, "Shirt");
        products[4] = new Product("Samsung", "Galaxy S21", 55000, "Electronics");
        products[5] = new Product("Apple", "iPhone 13", 70000, "Electronics");
        products[6] = new Product("Sony", "Headphones", 5000, "Electronics");
        products[7] = new Product("Puma", "T-Shirt", 1200, "Shirt");
        products[8] = new Product("RayBan", "Sunglasses", 4500, "Accessories");
        products[9] = new Product("HP", "Laptop", 60000, "Electronics");

        // a) Access all products
        System.out.println("All Products:");
        for (Product p : products) {
            p.display();
        }

        // b) Access all shirt products
        System.out.println("\nAll Shirt Products:");
        for (Product p : products) {
            if (p.type.equalsIgnoreCase("Shirt")) {
                p.display();
            }
        }

        // c) Access all shirts in price range 1500 - 2500
        System.out.println("\nShirts in price range 1500 - 2500:");
        for (Product p : products) {
            if (p.type.equalsIgnoreCase("Shirt") &&
                    p.price >= 1500 && p.price <= 2500) {
                p.display();
            }
        }

        // d) Access all products for a particular brand
        String searchBrand = "Samsung";
        System.out.println("\nProducts of brand " + searchBrand + ":");
        boolean found = false;
        for (Product p : products) {
            if (p.brand.equalsIgnoreCase(searchBrand)) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found for brand " + searchBrand);
        }

        // e) Access all electronics products
        System.out.println("\nAll Electronics Products:");
        for (Product p : products) {
            if (p.type.equalsIgnoreCase("Electronics")) {
                p.display();
            }
        }
    }
}
