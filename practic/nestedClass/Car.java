package src.practic.nestedClass;

public class Car {
    static int x = 10;
    public static void test() {
        System.out.println("this is test method");
    }
    static class Engine{
        static int y = 13;
        public static void start(){
            System.out.println("engine start");
        }
    }
}
