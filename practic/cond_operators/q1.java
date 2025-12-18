package src.practic.cond_operators;

public class q1 {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 5;
//        int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
//        System.out.println(z);
//        A->10

//        int x = 10;
//        System.out.println(x>10 ? "A": (x<10 ? "B":"C"));
//        C->c

//        int x = 10;
//        int y = 5;
//        int z = 7;
//        int result = (x < y)  ?  (y < z ? z : y)  : x;
//        System.out.println(result);
//        A->10

//        int a = 5;
//        int b = 10;
//        int c=(a>b) ? b++ : (a<b ? --b : b) ;
//        System.out.println(c);
//        D->9

//        int value=10;
//        int result=(value>5) ? (value<8?1:2) : 3;
//        System.out.println(result);
//        B->2

//        int x=5, y=7, z=3;
//        int result=(x>y) ? (y>z? x:y) : (x>z ? x:z);
//        System.out.println(result);
//        A->5

        int x=5, y=7, z=3;
        int result=(x<y) ? (y<z? x:y) : (x>z ? x:z);
        System.out.println(result);
//        B->7



    }
}
