package src.practic.practice;

public interface Vechicle {
    int speed = 100;

    void start();

    default void gps(){
        System.out.println("gps enable");
    }

    static void services(){
        System.out.println("vechicle service");
    }

    private void secret(){
        System.out.println("secret tech");
    }

    default void hybrid(){
        secret();
        System.out.println("hybrid engine mode");
    }

}
