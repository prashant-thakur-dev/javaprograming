package src.Inc_Dec;

public class q1 {
    public static void main(String[] args) {

        int a1=20;
        a1++;
        int b1=a1++;
        int c1=++b1;
        System.out.println(a1); //22
        System.out.println(b1); //22
        System.out.println(c1); //22

        int a2 =12;
        int b2 = a2++;
        b2++;
        int c2 = a2++ + --b2;
        System.out.println(a2); //14
        System.out.println(b2); //12
        System.out.println(c2); //25

        int a3 =10;
        a3++;
        int b3 =++a3;
        int c3 = a3++ + ++b3;
        b3++;
        System.out.println(a3); //13
        System.out.println(b3); //14
        System.out.println(c3); //25

        int a4 =12;
        int b4 =20;
        int c4 = a4++ + b4++ - ++a4 - --a4;
        System.out.println(c4); //5

        int x=10;
        int y=5;
        int z=x-- - --y + x++ + ++y;
        System.out.println(z); //20

        int x6 = 5;
        int result = x6++ - --x6 + x6-- - --x6;
        System.out.println(result); //2

        int a7 =5;
        int b7 =10;
        int c7 = a7-- + ++b7 - b7-- + ++a7;
        // 5 + 11 - 11 + 5
        System.out.println(c7); //10

        int x8 =12;
        x8 = x8++;
        x8 = x8++;
        x8 = x8++;
        x8 =++x8;
        x8 = x8++;
        System.out.println(x8);

        int x9 =12;
        int y9 = x9++ + ++x9; //x:14 y:26
        y9++; //y:27
        int z9 =++y9; //z=28 y=28
        int p9 = x9++ - ++y9 + z9++;//p:13
        // 13 - 29 + 29
        System.out.println(x9); //15
        System.out.println(y9); //29
        System.out.println(z9); //29
        System.out.println(p9); //13

        int a=12;
        int b=a++;
        b++;
        int c=a++ + --b;
        int d=a++ + ++b + c++;
        d++;
        c--;
        System.out.println(a); //15
        System.out.println(b); //13
        System.out.println(c); //25
        System.out.println(d); //53

    }
}
