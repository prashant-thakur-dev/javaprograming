package src.practic.FactoryMethod;

public class ShapeFactory {
    public static Shape getShape(String shape){
        if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
