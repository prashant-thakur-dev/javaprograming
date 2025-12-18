package src.practic.HasARelationship;

public class PracticeHasA {
    public static void main(String[] args) {
        Engine e = new Engine(700, "EV");
        Car c = new Car("moto", e);

        System.out.println(c.name);
        System.out.println(c.e);
        System.out.println(c.e.hp);
        System.out.println(c.e.type);
    }
}
