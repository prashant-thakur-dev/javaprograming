package src.practic.String;

public class ReverseWordAndChar {
    public static void main(String[] args) {
        String str = "hello my name is raj";
        String res = reverseWordAndChar(str);
        System.out.println(res);
    }

    private static String reverseWordAndChar(String str) {
        String rev = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                temp = c + temp;
            }
            if(c == ' ' || i == str.length()-1){
                rev = temp + " " + rev;
                temp = "";
            }
        }
        return rev;
    }
}
