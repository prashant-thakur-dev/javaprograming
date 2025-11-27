package src.Recursion;

public class FiveTable {
    public static void main(String[] args) {
        int n = 5, i = 1;
        printTable(n,i);
    }
    public static void printTable(int n,int i){
        if (i <= 10) {
            System.out.println(n +" X "+i+" = "+ n*i);
//            i++;
            printTable(n,i+1);
        }
    }

}
