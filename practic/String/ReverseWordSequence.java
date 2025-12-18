package src.practic.String;

public class ReverseWordSequence {
    public static void main(String[] args) {
        String str = "hello my name is raj";
        String res = reverseWordSequence(str);
        System.out.println(res);
    }

    private static String reverseWordSequence(String str) {
        String res = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c != ' '){
                temp = temp + c;
            }
            if(c == ' ' || i == str.length()-1){
                res = temp + " " + res;
                temp = "";
            }
        }
        return temp+" "+res;
    }
}
