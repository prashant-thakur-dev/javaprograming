package src.practic.Method;

public class Square {
    public static void main(String[] args) {
        int side = 10;
        getArea(side);
        getParameter(side);
    }
    public static void getArea(int side){
        System.out.println("Area = "+ side*side);
    }
    public static void getParameter(int side){
        System.out.println("Parameter = "+ 4*side);
    }
}
