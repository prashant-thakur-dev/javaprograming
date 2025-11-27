package src.Final;

public class MobileDriver {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("oppo", 15000, 8);
        System.out.println(m1.getName());
        System.out.println(m1.getPrice());
        System.out.println(m1.getRAM());
        Mobile m2 = new Mobile("vivo", 35000, 16);
        System.out.println(m2.getName());
        System.out.println(m2.getPrice());
        System.out.println(m2.getRAM());

    }
}
