package src.practic.Final;

public final class Mobile {
    private final String name;
    private final double price;
    private final int ram;

    Mobile(String name, double price, int ram) {
        this.name=name;
        this.price=price;
        this.ram=ram;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getRAM() {
        return ram;
    }
}
