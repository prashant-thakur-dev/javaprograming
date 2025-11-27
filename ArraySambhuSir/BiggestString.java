package src.ArraySambhuSir;

public class BiggestString {

    public static void main(String[] args) {
        String[] str = {"raj","rahul","shit","hips","dips","lipsss"};
        String big = str[0];
        for(String s : str){
            if (s.length()>big.length()){
                big = s;
            }
        }
        System.out.println(big);
    }
}
