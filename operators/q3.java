package src.operators;

public class q3 {
    public static void main(String[] args) {
        int a=1, b=2;
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("value of a : "+ a);
//        System.out.println("value of b : "+ b);

        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("value of a : "+ a);
        System.out.println("value of b : "+ b);
    }
}
