package src.practic.Array;

public class CharArray {
    public static void main(String[] args) {
        char[] c = {'a','b','b','c'};
        uniqueArrayElement(c);
    }

    private static void uniqueArrayElement(char[] ch) {
        int[] freq = new int[256];
        for (char c:ch){
            freq[c]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i +" "+ freq[i]);
            }
        }
    }
}

/*
Jpa Query method
whose name auto generate a database query based on defined naming convension. apring analyae the methos name and execute the query bahind the scene

read thod name and generate the jpql query
 */
