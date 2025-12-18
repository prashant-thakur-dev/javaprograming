package src.practic.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape("circle");
        assert s1 != null;
        s1.draw();
        Shape s2 = ShapeFactory.getShape("rectangle");
        assert s2 != null;
        s2.draw();
    }
}
