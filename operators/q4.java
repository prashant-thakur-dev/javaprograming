package src.operators;

public class q4 {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        int temp = a;
        a=b;
        b=c;
        c=a;
        a=temp;
        System.out.println("value of a : "+ a);
        System.out.println("value of b : "+ b);
        System.out.println("value of c : "+ c);

        a = a^b;
        b = a^b;
        b = b^c;
        c = b^c;
        c = c^a;
        a = c^a;

        System.out.println("value of a : "+ a);
        System.out.println("value of b : "+ b);
        System.out.println("value of c : "+ c);

    }
}
