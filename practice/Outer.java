package src.practice;

public class Outer {
    int a = 10;
    static int b = 100;

    static class Inner {
        public static void main(String[] args){
            System.out.println(b);
            Outer ou = new Outer();
            System.out.println(ou.a);
        }
    }
}


