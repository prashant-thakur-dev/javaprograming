package src.ArraySambhuSir;

public class EvenChar {
    public static void main(String[] args) {
        String[] str = {"raj","rahul","shit","hips","dips","lipsss"};
        int c = 0;
        for (String s : str){
            if (s.length()%2 == 0){
                System.out.println(s+" even");
                c++;
            }
            else {
                System.out.println(s+" odd");
            }
        }
        System.out.println(c);
    }
}
